package Final;
class Rahul{
	public final void data(){
		System.out.println("rahul......");
	}
}
class Nainwal extends Rahul{
	// final method can't override
	public final void data(){
		System.out.println("rahul......");
	}
	public final void data1(){
		System.out.println("Nainwal......");
	}
}
public class Final3 extends Rahul {
	public static void main(String[] args) {
		Nainwal ra = new Nainwal();
		ra.data();
	}
}
