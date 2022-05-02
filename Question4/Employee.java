import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Employee {
    private static final Address Address = null;
	private int empId;
	private String empName;

	private String email;
	private String password;
    private Address address;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(int empId, String empName, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	public Employee() {
		super();
	
	}
    public void display() {
    }
    public void getInput() {
    }
	
	
}


