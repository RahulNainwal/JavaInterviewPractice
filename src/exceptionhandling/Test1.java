package exceptionhandling;

import java.io.IOException;

public class Test1 {
public static void main(String[] args) {
	int x,y,z;
	int m,n,o;
	try{
		x=10;y=0;
		z = x/y;
	}
	catch (ArithmeticException e) {
		
	}
	catch (ArithmeticException e) {  // unreachable statement
		System.out.println(e.getMessage());
	}
	finally{
		System.out.println("Fist is executed");		
	}
	/*try{
		m=10;n=0;
		o = m/n;
	}
	catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	finally{
		System.out.println("Fist is executed");		
	}*/
}
}
