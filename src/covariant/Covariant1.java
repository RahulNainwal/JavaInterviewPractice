package covariant;
class One{
	One define(){
		System.out.println("IN ONE METHOD");
		return this;
	}
}
class Two extends One{
	One define(){
		System.out.println("IN TWO METHOD");
		return this;
	}
}
class Theee extends One{
	Theee define(){
		System.out.println("IN THREE METHOD");
		return this;
	}
}
public class Covariant1 {
public static void main(String[] args) {
	Two two = new Two();
	two.define();
	One one = new One();
	one.define();
	Theee th = new Theee();
	th.define();
}
}
