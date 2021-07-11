package twsjava.lib.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import twsjava.lib.client.Types.Method;

public class Group {
	private String m_name;
	private Method m_defaultMethod;
	private List<String> m_accounts = new ArrayList<>();

	public String name() 					{ return m_name; }
	public Method defaultMethod() 			{ return m_defaultMethod; }
	public List<String> accounts() 	{ return m_accounts; }

	public void name( String v) 			{ m_name = v; }
	public void defaultMethod( Method v) 	{ m_defaultMethod = v; }
	public void addAccount( String acct) 	{ m_accounts.add( acct); }

	/** @param val is a comma or space delimited string of accounts */
	public void setAllAccounts(String val) {
		m_accounts.clear();

		StringTokenizer st = new StringTokenizer( val, " ,");
		while( st.hasMoreTokens() ) {
			m_accounts.add( st.nextToken() );
		}
	}
}
