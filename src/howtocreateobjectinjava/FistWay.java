package howtocreateobjectinjava;
// there are three way to create object in java;

// Initializing an object means storing data into the object
// 1-by using reference variable
// 2-by Method;
// 3- by constructor

class Student {
	int id;
	String name, address;
}

public class FistWay {
	public static void main(String[] args) {
		Student s = new Student();// creating object
		s.id = 101;// //Initializing objects
		s.address = "12345";
		s.name = "raj";
		System.out.println(s.id + " " + s.address + " " + s.name);// printing
																	// data
	}
}
