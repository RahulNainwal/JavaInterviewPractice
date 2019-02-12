package BitInterview;

public class MagicalCandy {
public static void main(String[] args) {
	int[] arr = {3,10,4,2};
	while(arr[0] * arr[2] >arr[1]){
		arr[0] = arr[0] -1;
		arr[1] = arr[1] +arr[3];
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}
