package BitInterview;

public class PrimeArray {
public static void main(String[] args) {
	int[] A = { 1, 1, 2 };
	//int[] A = {1, 2, 1, 2 };
	//int[] A = {1, 10, 1, 1, 1, 1, 10};
	//int[] A = {7, 7, 7};
	int count =0;
	int A2=0;
    for(int i=0;i<A.length;i++){
        for(int j=i+1;j<=A.length-1;j++){
        	if(A[i] == A[j]){
        		A2++;
        	}
        	if(A[i] * A[j] == A[i] * A[i] || A[i] * A[j] == A[j] * A[j] ){
        		if(A2 != 0){
        			A[j] = A[j] + A2;
        		}
        		else{
                    A[j] = A[j] + 1;
        		}
                count++;
            }
        	for(int m=0;m<A.length;m++){
          	   if(A[j] == A[m] * A[m]){
          		   A[j] = A[j] + 1;
          		   count++;
          	   }
             }
        }
    }
    System.out.println(count);
}
}
