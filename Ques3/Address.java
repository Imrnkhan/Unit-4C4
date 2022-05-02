package Ques3;

public class Address extends Employee {

	private static final long serialVersionUID = 1L;

	private String state;
	private String city;
	private String pincode;

	public Address() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Address(String state, String city, String pincode) {
		// TODO Auto-generated constructor stub

		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public String getState()
	{
		return state;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getCity()
	{
		return city;
	}

	public void setPincode(String pincode)
	{
		this.pincode = pincode;
	}

	public String getPincode()
	{
		return pincode;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Address => State : " + " " + state + "," + " " + "City :" + " " + city + "," +" "+ "Pincode :" + " " + pincode ;
	}

}