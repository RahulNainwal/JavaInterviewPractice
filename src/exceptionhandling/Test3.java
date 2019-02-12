package exceptionhandling;

public class Test3 {
	static void getAge(int x) throws AgeException  {
		if(x > 10)
			System.out.println("10+");
		else
			// throw custom exception
			throw new AgeException("10 se chota hai tu");
	}
public static void main(String[] args) throws AgeException {
	getAge(15);
	System.out.println("Rest of code");
}
}
