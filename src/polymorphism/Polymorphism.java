package polymorphism;
class Person{
	String name="Raja";
	String address="Dun";
}
class Student extends Person{
	// A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.g.
	String name = "sona";
	String address = "DehradunDun";
	void myData(){
		System.out.println("name is rahul"+" Name"+name+" address"+address);
	}
}

public class Polymorphism {
public static void main(String[] args) {
	Person st = new Student();
	System.out.println(st.name+" "+st.address);
}
}
//output : Raja ,Dun