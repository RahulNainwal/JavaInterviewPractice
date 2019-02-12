package Interface;
interface One1{
	default void show(){
		System.out.println("Within default method");
	}
	public static void data(){
		System.out.println("within static method");
	}
}
class AB implements One1,One{

	@Override
	public void show() {
		System.out.println("Base");
	}
	
}
public class WithStaticAndDefault1 extends AB {
public static void main(String[] args) {
	WithStaticAndDefault1 f = new WithStaticAndDefault1();
	One1.data();
	f.show();
}
}
