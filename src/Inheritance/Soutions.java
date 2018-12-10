package Inheritance;

import java.util.Scanner;

class Solutions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = scan.next();
		System.out.println("Enter Last Name");
		String lastName = scan.next();
		System.out.println("Enter Id");
		int id = scan.nextInt();
		System.out.println("Enter Number of Subjects:");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		System.out.println("Enter Marks for subjects:");
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		Students s = new Students(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}