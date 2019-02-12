package ongraph;
// find multiple missing values from array.
public class Ongraph3 {
public static void main(String[] args) {
	int sum =0;
	int array[] = { 0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20, 21, 23 };
	for(int i=0;i<array.length;i++){
		sum = sum + array[i];
		int realSum = (array[i])*(array[i]+1)/2;
		if(sum != realSum){
			System.out.println("missing"+(realSum-sum));
		}
	}
}
}
