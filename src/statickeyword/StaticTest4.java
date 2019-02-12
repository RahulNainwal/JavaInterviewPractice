package statickeyword;
class A{
	public static void dis(){
		System.out.println("Class A is here");
	}
}
class B extends A{
	public static void dis(){
		System.out.println("Class B is here");
	}
}
public class StaticTest4 {
public static void main(String[] args) {
	A a = new B();
	a.dis();
}
}
