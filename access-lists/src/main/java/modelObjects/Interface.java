/**
 * 
 */
package modelObjects;

import java.util.List;

/**
 * @author exalt
 *
 */
public class Interface {

	private String name;
	private List<PolicyMap> policyMap;
	private List<AccessList> accessList;
	private Status status ; 
	private String mtu ; 
	private Duplex duplex ;

	public Interface() {
		super();
	}

	/**
	 * @param name
	 * @param policyMap
	 * @param number
	 */
	public Interface(String name, List<PolicyMap> policyMap, String number) {
		super();
		this.name = name;
		this.policyMap = policyMap;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the policyMap
	 */
	public List<PolicyMap> getPolicyMap() {
		return policyMap;
	}

	/**
	 * @param policyMap
	 *            the policyMap to set
	 */
	public void setPolicyMap(List<PolicyMap> policyMap) {
		this.policyMap = policyMap;
	}

	/**
	 * @return the accessList
	 */
	public List<AccessList> getAccessList() {
		return accessList;
	}

	/**
	 * @param accessList
	 *            the accessList to set
	 */
	public void setAccessList(List<AccessList> accessList) {
		this.accessList = accessList;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return the mtu
	 */
	public String getMtu() {
		return mtu;
	}

	/**
	 * @param mtu the mtu to set
	 */
	public void setMtu(String mtu) {
		this.mtu = mtu;
	}

	/**
	 * @return the duplex
	 */
	public Duplex getDuplex() {
		return duplex;
	}

	/**
	 * @param duplex the duplex to set
	 */
	public void setDuplex(Duplex duplex) {
		this.duplex = duplex;
	}
	
	public String toString () 
	{
		return "" ;
	}

}
