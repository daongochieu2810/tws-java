package twsjava.lib.controller;

public class Alias {
	private String m_account;
	private String m_alias;

	public String alias() { return m_alias; }
	public String account() { return m_account; }

	public void alias( String v) { m_alias = v; }
	public void account( String v) { m_account = v; }

	@Override public String toString() {
		return m_account + " / " + m_alias;
	}
}
