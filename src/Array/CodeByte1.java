package Array;

/*
 Using the Java language, have the function ArrayAddition(arr) take the array
  of numbers stored in arr and return the string true if any combination of numbers
   in the array (excluding the largest number)
  can be added up to equal the largest number in the array, otherwise return the string false... 
 */

public class CodeByte1 {
public static void main(String[] args) {
	int[] arr = {3,5,-1,8,12};
	Add add = new Add();
	int biggest = add.biggest(arr);
	int sum = add.sum(arr);
	int result = add.sum(arr) - add.biggest(arr);
	/*System.out.println(add.biggest(arr));
	System.out.println(add.sum(arr));*/
	if(result >= biggest){
		System.out.println(true);
	}else{
		System.out.println(false);
	}
}
}
class Add{
	
		int biggest(int[] arr){
			for(int i = 0;i<arr.length-1;i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] =temp;
				}
		}
			return arr[arr.length-1];	
		}
		
		int sum(int[] arr){
			int sum= 0;
			for(int i=0;i<arr.length;i++){
			sum = sum+ arr[i];	
			}
			return sum;
		}
}