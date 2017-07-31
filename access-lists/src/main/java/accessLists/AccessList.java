package accessLists;

public class AccessList {

	private int number;
	private String type;
	private String control;

	/**
	 * 
	 */
	public AccessList() {
		super();
	}

	/**
	 * @param number
	 * @param type
	 * @param control
	 * @param direction
	 */
	public AccessList(int number, String type, String control) {
		super();
		this.number = number;
		this.type = type;
		this.control = control;

	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
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

	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}

	/**
	 * @param control
	 *            the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}

}
