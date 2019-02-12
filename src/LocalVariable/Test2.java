package LocalVariable;

public class Test2 {
public static void main(String[] args) {
	static int x = 10; // local variable can't have any access modifier except final.
	final int y = 20; // final is the only applicable modifier for local variable.
	System.out.println(x);
}
}
