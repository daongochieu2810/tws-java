package twsjava.lib.client;

public class TickAttribLast {
	private boolean m_pastLimit = false; // aka halted
	private boolean m_unreported = false;

	public boolean pastLimit() {
		return m_pastLimit;
	}
	public boolean unreported() {
		return m_unreported;
	}
	public void pastLimit(boolean pastLimit) {
		this.m_pastLimit = pastLimit;
	}
	public void unreported(boolean unreported) {
		this.m_unreported = unreported;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(m_pastLimit ? "pastLimit " : "");
		sb.append(m_unreported ? "unreported " : "");
		return sb.toString();
	}
}
