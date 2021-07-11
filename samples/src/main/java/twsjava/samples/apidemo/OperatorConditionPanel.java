package twsjava.samples.apidemo;

import twsjava.lib.client.OperatorCondition;

import twsjava.samples.apidemo.util.TCombo;
import twsjava.samples.apidemo.util.UpperField;

public class  OperatorConditionPanel<T extends OperatorCondition> extends OnOKPanel {
	final T m_condition;
	final TCombo<String> m_operator = new TCombo<>("<=", ">=");
	final UpperField m_value = new UpperField();

	OperatorConditionPanel(T condition) {
		m_condition = condition;

		m_operator.setSelectedIndex(m_condition.isMore() ? 1 : 0);
	}

	public T onOK() {
		m_condition.isMore(m_operator.getSelectedIndex() == 1);

		return m_condition;
	}

	protected T condition() {
		return m_condition;
	}
}
