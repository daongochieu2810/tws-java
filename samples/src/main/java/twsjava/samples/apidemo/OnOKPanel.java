package twsjava.samples.apidemo;

import twsjava.lib.client.OrderCondition;

import twsjava.samples.apidemo.util.VerticalPanel;

public abstract class OnOKPanel extends VerticalPanel {
	public abstract OrderCondition onOK();
}
