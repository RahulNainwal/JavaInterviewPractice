package polymorphism;

class One {
	public void add(Integer i) {
		System.out.println(i);
	}
}

class Two extends One {
	public void add(int i) {
		System.out.println("second " + i);
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		One two = new Two();
		two.add(10);
	}
}
