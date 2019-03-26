package Inheritance;

interface OneInterface {
	public void add();
}

class OneClass {
	public void add() {
		System.out.println("In class Add method");
	}
}

public class ShubhamQuestion extends OneClass implements OneInterface {
	public static void main(String[] args) {
		ShubhamQuestion sq = new ShubhamQuestion();
		sq.add();
	}
}
