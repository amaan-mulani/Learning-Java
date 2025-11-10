package org.ycpait.studentmanagementapp.entity;

public class Student {
	private int rollNumber;
	private Address postalAddress;
	
	private Trainer instructor;
	
	//************CONSTRUCTOR**********************
	public Student(int rollNumber, Address postalAddress)
	{
		super();
		this.rollNumber=rollNumber;
		this.postalAddress=postalAddress;
	}
	//*************POSTAL ADDRESS SETTER GETTER*********************
	
	public Address getPostalAddress() {
		return postalAddress;
	}



	public void setPostalAddress(Address postalAddress) {
		this.postalAddress = postalAddress;
	}


	//**************INSTRUCTOR SETTER GETTER********************
	public Trainer getInstructor() {
		return instructor;
	}



	public void setInstructor(Trainer instructor) {
		this.instructor = instructor;
	}

	//**********************************
	
}
