package modelObjects;

public class PolicyMap {

	private String name;

	/**
	 * 
	 */
	public PolicyMap() {
		super();
	}

	/**
	 * @param name
	 * @param type
	 */
	public PolicyMap(String name, String type) {
		super();
		this.name = name;
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

}