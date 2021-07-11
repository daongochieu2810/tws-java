package twsjava.samples.apidemo;

import twsjava.samples.apidemo.util.NewTabbedPanel;

public class OptionsPanel extends NewTabbedPanel {
	private final OptionChainsPanel m_optionChains = new OptionChainsPanel();
	private final ExercisePanel m_exercisePanel = new ExercisePanel();

	OptionsPanel() {
		NewTabbedPanel tabs = this;
		tabs.addTab( "Option Chains", m_optionChains);
		tabs.addTab( "Option Exercise", m_exercisePanel);
	}
}
