package HackerEarth;

import java.util.ArrayList;

// find minimum operation using +1,*2 
public class MinimuOperation {
	public static void main(String[] args) {
		int[] arr = { 10, 3, 4, 5, 76, 753, 23 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int num = arr[i];
			while (num != 0) {
				if (num % 2 != 0) {
					num -= 1;
				} else {
					num /= 2;
				}
				count++;
			}
			list.add(count);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(arr[i] + " ---- " + list.get(i));
		}
	}
}
