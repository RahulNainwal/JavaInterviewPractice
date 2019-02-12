package constructor;

class Student2{
	public Student2(){
		System.out.println("In Constructor");
	}
	void Display(){
		System.out.println("student2");
	}
}
class Student3 extends Student2{
	void Display(){
		System.out.println("student3");
	}
}
// Constructor never inherited.
public class ConsTest{
public static void main(String[] args) {
	Student3 stu= new Student3();
	stu.Display();
}
}
