package BitInterview;
import java.awt.List;
import java.util.ArrayList;

public class BitInterview {
public static void main(String[] args) {
	int[] A = {2,2};
	ArrayList<Integer> list = list = new ArrayList<>();
	for(int i=0;i<A.length;i++){
		int count=0;
		if(A[i]<=1){
			count =1;
		}else{
			for(int k=2;k<=A[i]/2;k++){
				if(A[i] % k== 0 ){
					count = count + 1;
				}
			}
		}
		if(count <1){
			list.add(A[i]);
		}
		
}
	System.out.println((int)Math.pow(2, list.size())-1);
}
}
