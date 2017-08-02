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

}
