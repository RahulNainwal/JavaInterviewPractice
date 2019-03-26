package globallogic;

// important
public class StringSumUpto {
	public static void main(String[] args) {
		int n = 3, sum = 25;
		// int n = 5, sum = 42;
		char[] arr = new char[n];
		for (int i = 0; i < n; i++) {
			arr[i] = 'a';// assign 'a' to all n char initially
		}
		for (int i = arr.length - 1; i >= 0; i--) { // to get lexicographically order we start from reverse
			if (sum > 26) {
				arr[i] = (char) (arr[i] + 25);
				sum -= 26;
				n = n - 1; 
			} else if (sum > 0) {
				arr[i] = (char) (arr[i] + sum - n);
				sum = sum - (sum - i);
				n = n - 1;
			} else {
				break;
			}
		}
		System.out.println(new String(arr));
	}
}
