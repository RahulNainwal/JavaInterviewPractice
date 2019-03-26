package Interface;

public class InterfaceCodeCheck implements InterfaceCode {
	// interface has same default method and class has same method with different implementation .so which one is called?
	// answer is class ad() method is called because class has more priority over interface.
	public void ad() {
		System.out.println("Method is running in main class");
	}

	public static void main(String[] args) {
		InterfaceCode c = new InterfaceCodeCheck();
		c.ad();
	}
}
