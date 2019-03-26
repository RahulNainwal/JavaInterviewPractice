package globallogic;

import java.util.ArrayList;

//upto
public class SumTOSpecific2 {
	public static void main(String[] args) {
		int sum = 42, x = 5;
		ArrayList<Integer> list = new ArrayList<>();
		while (sum != 0 && x != 0) {
			if (sum > 25) {
				list.add(25);
				sum = sum - 25;
				x = x - 1;
			} else if (sum < 25) {
				list.add(sum + 1 - x);
				sum = sum - (sum + 1 - x);
				x = x - 1;
			} else {
				list.add(1);
				sum = sum - 1;
				x = x - 1;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
