package com.atcs.comparable;

public class Employee implements Comparable<Employee> {
	private Integer empId;
	private String empName;
	private Double sal;
	private String adds;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	public String getAdds() {
		return adds;
	}

	public void setAdds(String adds) {
		this.adds = adds;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", sal=" + sal + ", adds=" + adds + "]";
	}

	@Override
	public int compareTo(Employee arg0) {

		return this.getEmpName().compareTo(arg0.getEmpName());
	}

}
