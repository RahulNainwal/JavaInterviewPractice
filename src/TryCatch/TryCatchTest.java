package TryCatch;

import java.util.Scanner;

public class TryCatchTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try{
		int c = sc.nextInt()/sc.nextInt();
	}catch(Exception ex){
		System.out.println(ex);
	}
}
}
