package statickeyword;
class MyTest{
	static{
		System.out.println("In Static");
	}
}
public class StaticTest3 {
public static void main(String[] args) {
System.out.println("In main Class");
MyTest mt = new MyTest();
}
}
