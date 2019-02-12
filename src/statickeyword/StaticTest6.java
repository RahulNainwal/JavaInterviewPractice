package statickeyword;
class User{
	public static void run(){
		System.out.println("Go on....");
	}
}
public class StaticTest6 {
	public static void run() {
		System.out.println("Programe is Running");
	}

	public static void main(String[] args) {
		StaticTest6.run();
		User.run();
	}
}
