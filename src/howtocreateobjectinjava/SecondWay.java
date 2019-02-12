package howtocreateobjectinjava;
class Student1{
	int id;
	String name,address;
	char ch;
	public void initialize(int id,String name,String address,char ch){
		this.id = id;
		this.name = name;
		this.address = address;
		this.ch = ch;
	}
}
public class SecondWay {
public static void main(String[] args) {
	char ch1=' ';
	Student1 s1 = new Student1();// Object Creation.
	System.out.println(s1.address+" "+s1.id+" "+s1.name+" "+s1.ch);
	s1.initialize(123, "Akay", "Panjab",'P'); // Object initialization.
	System.out.println(s1.id+" "+s1.address+" "+s1.name+" "+s1.ch);
}
}
