package twsjava.lib.controller;

public class TradeId {
	private String m_key;
	private String m_full;

	public String key() 		{ return m_key; }
	public String full() 		{ return m_full; }

	public TradeId( String id) {
		m_full = id;
		int i = id.lastIndexOf( '.');
		m_key = id.substring( i + 1);
	}
}
