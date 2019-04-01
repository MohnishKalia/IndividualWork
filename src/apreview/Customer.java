package apreview;

public class Customer {
	private String name;
	private String city;
	private String state;

	public Customer(String xName, String xCity, String xState) {
		name = xName;
		city = xCity;
		state = xState;
	}

	/** ©return the name of this customer */
	public String getName() {
		return name;
	}

	/** ©return the city of this customer */
	public String getCity() {
		return city;
	}

	/** ©return the state of this customer */
	public String getState() {
		return state;
	}
}
