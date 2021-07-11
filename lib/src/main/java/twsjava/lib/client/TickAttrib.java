package twsjava.lib.client;

public class TickAttrib {
	private boolean m_canAutoExecute = false;
	private boolean m_pastLimit = false;
	private boolean m_preOpen = false;

	public boolean canAutoExecute() {
		return m_canAutoExecute;
	}
	public boolean pastLimit() {
		return m_pastLimit;
	}
	public boolean preOpen() {
		return m_preOpen;
	}
	public void canAutoExecute(boolean canAutoExecute) {
		this.m_canAutoExecute = canAutoExecute;
	}
	public void pastLimit(boolean pastLimit) {
		this.m_pastLimit = pastLimit;
	}
	public void preOpen(boolean preOpen) {
		this.m_preOpen = preOpen;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(m_canAutoExecute ? "canAutoExecute " : "");
		sb.append(m_pastLimit ? "pastLimit " : "");
		sb.append(m_preOpen ? "preOpen " : "");
		return sb.toString();
	}
}
