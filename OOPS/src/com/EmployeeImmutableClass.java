package com.encapsulation;

public final class EmployeeImmutableClass {
	final String pancardNumber; // initialize pancardnumber here final String pancardNumber =""

	static {
		//pancardNumber = "dd";
		System.out.println("static block"); // initialize pancardnumber here 
	}
	{
		System.out.println("normal block");  // initialize pancardnumber here 
		//pancardNumber = "dd";
	}

	public EmployeeImmutableClass(String pancardNumber) {   // initialize pancardnumber here 
		System.out.println("constructor");
		this.pancardNumber = pancardNumber;
	}
	
//	public void setPacardNumber(String pannum){ // Cant initialize pancardnumber here 
//		pancardNumber = pannum;
//	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}
