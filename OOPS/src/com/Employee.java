package com.encapsulation;

public class Employee {
	private Integer empid;
	private String empName;
	private Double sal;
	private String authTocken;

	public String getAuthTocken() {
		return authTocken;
	}

	public void setAuthTocken(String authTocken) {
		// To be safe, force calling code to go through your methods rather than
		// going directly
		// to instance variables so that you can put your validations
		boolean isAuth = matchAuthrization(authTocken);
		if (isAuth) {
			System.out.print("your Authorized person : ");
			this.authTocken = authTocken;
		} else {
			this.authTocken = "Not Authorized";
		}
	}

	private boolean matchAuthrization(String authTocken2) {
		if (authTocken2.equals("Sarvesh19")) {
			return true;
		}
		return false;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((authTocken == null) ? 0 : authTocken.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empid == null) ? 0 : empid.hashCode());
		result = prime * result + ((sal == null) ? 0 : sal.hashCode());
		return 15;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (authTocken == null) {
			if (other.authTocken != null)
				return false;
		} else if (!authTocken.equals(other.authTocken))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empid == null) {
			if (other.empid != null)
				return false;
		} else if (!empid.equals(other.empid))
			return false;
		if (sal == null) {
			if (other.sal != null)
				return false;
		} else if (!sal.equals(other.sal))
			return false;
		return true;
	}
	
	

}
