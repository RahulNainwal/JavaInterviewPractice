package HackerEarth;

import java.util.LinkedHashMap;
import java.util.Map;

public class NewYearChaos {
	public static void main(String[] args) {
		// int arr[] = { 2, 1, 5, 3, 4 };
		int arr[] = { 1, 2, 5, 3, 7, 8, 6, 4 };
		// int arr[] = { 2, 5, 1, 3, 4 };
		int count = 0;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i], index = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			// System.out.println(i+"<---->"+index);
			if (arr[i] > arr[index] && index >= i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;

				System.out.println(arr[i] + "----->" + arr[index]);
				count++;
				if (!map.containsKey(arr[i]))
					map.put(arr[i], 1);
				else {
					int j = map.get(arr[i]);
					map.put(arr[i], j + 1);
				}
				if (!map.containsKey(arr[index]))
					map.put(arr[index], 1);
				else {
					int j = map.get(arr[index]);
					map.put(arr[index], j + 1);
				}
			}
		}
		boolean m = true;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 2) {
				m = false;
				break;
			}
		}
		if (m)
			System.out.println(count);
		else
			System.out.println("Too chaotic");

	}
}
