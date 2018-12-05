package TwoDArray;

import java.util.Scanner;

public class First2DArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[][] twoD = new int[4][3];
	System.out.println("Enter Array Elements:");
	for(int i=0;i<4;i++){
		for(int j=0;j<3;j++){
			twoD[i][j] = sc.nextInt();
		}
	}
	System.out.println("Two Dimensional Array is:");
	for(int i=0;i<4;i++){
		for(int j=0;j<3;j++){
			System.out.print(twoD[i][j]+"\t");
		}
		System.out.println();
	}
}
}
