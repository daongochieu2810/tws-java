package twsjava.samples.apidemo;

import twsjava.lib.client.HistogramEntry;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JComponent;

public class Histogram extends JComponent {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private static final int m_barHeight = 15;
	private final List<HistogramEntry> m_rows;
	private static final int m_x0 = 40;

	public Histogram(List<HistogramEntry> rows) {
		m_rows = rows;
	}

	@Override protected void paintComponent(Graphics g) {
		int y = 0;
		long max = getMax();

		int width = getWidth() - m_x0;

		for (HistogramEntry bar : m_rows) {
			int x1 = (int)((bar.size * width) / max);

			String label = bar.price + "";

			g.setColor(Color.red);
			g.fillRect(m_x0, y, x1, m_barHeight);
			g.setColor(Color.black);
			g.drawString(label, 0, y + m_barHeight - 3);
			g.drawRect(m_x0, y, x1, m_barHeight);

			y += m_barHeight;
		}
	}

	long getMax() {
		return m_rows.stream().map(entry -> entry.size).max(Long::compare).orElse((long) -1);
	}

	@Override public Dimension getPreferredSize() {// why on main screen 1 is okay but not here?
		return new Dimension(100, m_rows.size() * m_barHeight);
	}

}
