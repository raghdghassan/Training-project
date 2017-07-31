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
	List<PolicyMap> policyMap;
	private String number;

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
		this.number = number;
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
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

}
