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
	private String status ; 
	private String mtu ; 
	private Duplex duplex ;
	private String duplex1;

	
	


	/**
	 * @return the duplex1
	 */
	public String getDuplex1() {
		return duplex1;
	}

	/**
	 * @param duplex1 the duplex1 to set
	 */
	public void setDuplex1(String duplex1) {
		this.duplex1 = duplex1;
	}

	public Interface() {
		super();
	}

	/**
	 * @param name
	 * @param policyMap
	 * @param number
	 */
	public Interface(String name , String status , String mtu,String duplex1  ) {
		super();
		this.name = name;
		this.status=status;
		this.mtu=mtu ; 
		this.duplex1=duplex1;
				
		
	}
	
	
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
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
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
		return "name: "+ name+"\n"+"Duplex :" +duplex1+"\n"+"mtu : "+mtu+"\n"+"Status :" + status ;
	}
	
	public void addInterface(Interface interface1) {
		interface1.addInterface(interface1);
	}


}
