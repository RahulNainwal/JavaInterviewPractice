package Final;
class FinalTest{
	public final void getData(){
		System.out.println("In final method");
	}
}
class FinalTest1 extends FinalTest{
	// final method can't be inherited.
	public final void getData(){
		System.out.println("In final method");
	}
}
public class Final1 {
public static void main(String[] args) {
	FinalTest1 ft = new FinalTest1();
	ft.getData();
}
}
