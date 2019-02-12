package InnovationM;

public class PascalTriangle {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=5;i++){
		int m=1;
		for(int j=n;j>i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print(m+" ");
		}
		System.out.println();
	}
}
}
