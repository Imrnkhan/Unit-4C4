package Ques3;

import java.io.Serializable;

public class Employe implements Serializable {


	private static final long serialVersionUID = 1L;

	private int empId;
	private String empName;
	private Address address;
	private String email;
	transient private String password;

	public Employe() {
		// TODO Auto-generated constructor stub
	}

	public Employe(int empId, String empName, Address address, String email, String password)
	{
		// TODO Auto-generated constructor stub
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.email = email;
		this.password = password;
	}


	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	public int getEmpId()
	{
		return empId;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String gegtEmail()
	{
		return email;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getPassword()
	{
		return password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee => Employee ID : " + " " + empId + "," + " " + "Employee Name :" + " " + empName + "," + " " + "Employee Address :" + " " + address + "," + " " + "Employee Password :" + " " + password;
	}

}