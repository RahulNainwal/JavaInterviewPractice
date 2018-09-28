package Array;

public class SwapingInArray {
public static void main(String[] args) {
	int[] arr = {4,53,23,11,34,54,2232,4,12,3223,43};
	int index = 0;
	for(int i=1;i<arr.length;i++){
		if(arr[i] % 2 == 0){
			while(i != index){
				int x = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = x;
				i--;
			}
			index++;
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}
}
