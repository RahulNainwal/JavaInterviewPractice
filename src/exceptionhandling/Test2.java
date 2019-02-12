package exceptionhandling;

public class Test2 {
	static void getAge(int x)  {
		if(x > 10)
			System.out.println("10+");
		else
			throw new ArithmeticException("10 se chota hai tu");
	}
public static void main(String[] args) {
	getAge(15);
	System.out.println("Rest of code");
}
}
