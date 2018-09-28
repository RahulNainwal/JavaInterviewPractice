package Array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicacy {
public static void main(String[] args) {
	int[] arr = {1,1,2,3,4,4,5,5};
	int n= arr.length;
	if(n == 0 || n == 1)
		return;
	// one way to remove duplicacy from arry using arraylist
	/*List<Integer> list = new ArrayList<>();
	for(int i = 0;i<arr.length;i++){
			if(!list.contains(arr[i])){
				list.add(arr[i]);
			}
	}
	System.out.println(list);
	*/
	// Another way to remove duplicacy from array
	int j =0;
	int[] temp = new int[n];
	 for (int i=0; i<n-1; i++){  
         if (arr[i] != arr[i+1]){ 
        	 // Either this
             /*temp[j] = arr[i];  
             j++;*/
        	// Either this one
             temp[j++] = arr[i];  
        	 
         }  
      }  
     temp[j++] = arr[n-1];     
     // Changing original array  
     for (int i=0; i<j; i++){  
         arr[i] = temp[i];  
         System.out.println(arr[i]);
     }  
     //System.out.println(arr.length);
}
}
