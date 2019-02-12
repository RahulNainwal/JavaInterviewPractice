package Interface;
interface One{
	default void show(){
		System.out.println("Within default method");
	}
	public static void data(){
		System.out.println("within static method");
	}
}
public class WithStaticAndDefault implements One {
public static void main(String[] args) {
	WithStaticAndDefault f = new WithStaticAndDefault();
	One.data();
	f.show();
}
}
