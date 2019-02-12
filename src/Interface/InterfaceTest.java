package Interface;

interface runn {
	void run();

	void run(int x, int y);
}

class A implements runn {

	@Override
	public void run() {
		System.out.println("Running in A");
	}

	@Override
	public void run(int x, int y) {
		System.out.println("Running1 in A");
	}

}

class B implements runn {

	@Override
	public void run() {
		System.out.println("Running in B");
	}

	@Override
	public void run(int x, int y) {
		System.out.println("Running1 in B");
	}

}

public class InterfaceTest {
public static void main(String[] args) {
	B b = new B();
	b.run();
	b.run(10, 20);
	A c = new A();
	c.run();
	c.run(30, 84);
}
}
