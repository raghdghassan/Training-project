package modelObjects;

public class PolicyMap {

	private String name;
	private String type;

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
		this.type = type;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}