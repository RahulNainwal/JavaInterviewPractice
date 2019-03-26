package globallogic;

import java.util.ArrayList;

public class SumTOSpecific1 {
	public static void main(String[] args) {
		int sum = 73;
		ArrayList<Integer> list = new ArrayList<>();
		while (sum != 0) {
			if (sum > 25) {
				list.add(25);
				sum = sum - 25;
			} else {
				list.add(sum);
				sum = sum-sum;
			}
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
