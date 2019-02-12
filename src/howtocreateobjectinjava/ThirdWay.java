package howtocreateobjectinjava;

class Student2 {
	int id;
	String name, address;
	char ch;

	public Student2(int id, String name, String address, char ch) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.ch = ch;
	}
}

public class ThirdWay {
	public static void main(String[] args) {
		// object creation and initialization.
		Student2 s2 = new Student2(123, "Hans", "UP", 'I');
		System.out.println(s2.id + " " + s2.name + " " + s2.address);
		// creating multiple object of same type.
		Student2 s3 = new Student2(123, "mohan", "Naini", 'N'), s4 = new Student2(123, "rani", "nainital", 'u');
	}
}
