package statickeyword;

public class StaticTest7 {
	public void add(int a ,int b) {
		System.out.println("add data");
	}

	public static void main(String[] args) {
		System.out.println("main is running");
		add(0, 0); // we can't call non- static from static block;
	}
}
