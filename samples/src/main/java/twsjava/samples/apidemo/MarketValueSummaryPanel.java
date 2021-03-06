package twsjava.samples.apidemo;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import twsjava.lib.controller.ApiController.IMarketValueSummaryHandler;
import twsjava.lib.controller.MarketValueTag;

import twsjava.samples.apidemo.AccountInfoPanel.MktValModel;
import twsjava.samples.apidemo.AccountInfoPanel.Table;
import twsjava.samples.apidemo.util.HtmlButton;
import twsjava.samples.apidemo.util.NewTabbedPanel.NewTabPanel;
import twsjava.samples.apidemo.util.VerticalPanel;

public class MarketValueSummaryPanel extends NewTabPanel implements IMarketValueSummaryHandler {
	private MktValModel m_model = new MktValModel();

	MarketValueSummaryPanel() {
		HtmlButton sub = new HtmlButton( "Subscribe") {
			protected void actionPerformed() {
				subscribe();
			}
		};

		HtmlButton desub = new HtmlButton( "Desubscribe") {
			protected void actionPerformed() {
				desubscribe();
			}
		};

		JPanel buts = new VerticalPanel();
		buts.add( sub);
		buts.add( desub);

		JTable table = new Table( m_model, 2);
		JScrollPane scroll = new JScrollPane( table);

		setLayout( new BorderLayout() );
		add( scroll);
		add( buts, BorderLayout.EAST);
	}

	/** Called when the tab is first visited. */
	@Override public void activated() {
		subscribe();
	}

	/** Called when the tab is closed by clicking the X. */
	@Override public void closed() {
		desubscribe();
	}

	private void subscribe() {
		ApiDemo.INSTANCE.controller().reqMarketValueSummary( "All", this);
	}

	private void desubscribe() {
		ApiDemo.INSTANCE.controller().cancelMarketValueSummary( this);
		m_model.clear();
	}

	@Override public void marketValueSummary(String account, MarketValueTag tag, String value, String currency) {
		m_model.handle( account, currency, tag, value);
	}

	@Override public void marketValueSummaryEnd() {
	}
}
