package Array;

public class ReverseOfArrayString {
	public static void main(String args[]){
		String[] str = {"Rahul","Nainwal","Chamoli","Uttarakhand","India"};
		System.out.println("Array String is ");
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}
		System.out.println("Reverse Of Array String");
		for(int i=str.length-1;i>=0;i--){
			// Reverse array element
			System.out.print(str[i]+" ");
		}
		System.out.println("Each string in reverse order");
		for(int i=str.length-1;i>=0;i--){
			// Reversr each string
			for(int j=str[i].length()-1;j>=0;j--){
				System.out.print(str[i].charAt(j));
			}
			System.out.println(" ");
		}
	}
}
