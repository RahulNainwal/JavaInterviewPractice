package Array;

public class Type1 {
public static void main(String[] args) {
	int arr[]= new int[10];
	int temp[] = new int[10];
	for(int i=0;i<arr.length;i++){
		arr[i] = i;
	}
	for(int i=0;i<arr.length;i++){
		temp[i] = arr[i];
	}
	int index = 0;
	/*for(int i=0;i<arr.length;i++){
		if(i != 0 && temp[i] % 2 == 0){
			arr[index] = temp[i];
			index++;
		}
	}
	for(int i=0;i<arr.length;i++){
		if(temp[i] == 0){
			arr[index++] = temp[i];
		}
	}
	for(int i=0;i<arr.length;i++){
		if(i != 0 && temp[i] % 2 != 0){
			arr[index] = temp[i];
			index++;
		}
	}
	for(int k=0;k<arr.length;k++){
		System.out.println(arr[k]);
	}*/
	for(int i=1;i<arr.length;i++){
		if(arr[i] % 2 == 0){
			while(i != index){
				int temp1 = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp1;
				i--;
			}
			index++;
		}
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}
