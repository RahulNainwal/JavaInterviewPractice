package wittybrain;

import java.util.Scanner;

public class ObjectArray {
	public static void main(String[] args) {
		Object[] arr ={1,"jid",'r',2};
		Scanner sc = new Scanner(System.in);
		arr[0] = "Rahul";
		arr[1] = 23;
		arr[2] = 'x';
		arr[4] = 1.23f;
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
	}
}
