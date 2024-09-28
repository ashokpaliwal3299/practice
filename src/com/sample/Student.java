package com.sample;

public class Student {

	int rollNum ;
	String name;
	String address ;
	String surname ;
	
	Student(){};
	
	
	Student(int rollNum, String name, String address, String surname){
		this.name = name;
		this.address = address;
		this.rollNum = rollNum;
		this.surname = surname;
	}
	
	public static void main(String args[]) {
		Student s = new Student(1, "yash" , "address-abc", "hadade");
		
		
		System.out.println(s.toString());
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNum=" + rollNum + ", address=" + address + ", surname=" + surname + "]";
	}

	
//	public String toString() {
//		return rollNum + " " + name + " " + address + " " + surname;
//	}
}
