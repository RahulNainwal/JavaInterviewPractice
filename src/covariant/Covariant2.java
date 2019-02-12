package covariant;
// when a method have different return type then parent class method then it is know as covariant return type.
// but it is necessary that the return type of subclass must be sub-type of parent method return type.
class Ek {
	Object ekMethod() {
		System.out.println("Ek Method is runing");
		return this;
	}
}

class Do extends Ek {
	String ekMethod() {
		System.out.println("Second Method is running");
		return "rahul";
	}
}

class Theen extends Ek {
	Integer ekMethod() {
		System.out.println("theen method is running");
		return 10;
	}
}

public class Covariant2 {
	public static void main(String[] args) {
		Ek ek = new Ek();
		System.out.println(ek.ekMethod());
		Ek ek1 = new Do();
		System.out.println(ek1.ekMethod());
		Ek ek2 = new Theen();
		System.out.println(ek2.ekMethod());
	}
}
