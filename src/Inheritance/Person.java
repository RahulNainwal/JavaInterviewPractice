package Inheritance;

public class Person {
	String fname,lname;
	int x;
	int[] score= new int[2];
	public Person(String s1,String s2,int id){
		this.fname = s1;
		this.lname = s2;
		x = id;
	}
	
	public void printPerson() {
		System.out.println("ID :"+x);
		System.out.println("FirstName :"+fname);
		System.out.println("LastName :"+lname);
	}
	
}
