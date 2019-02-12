package InnovationM;

public class Pattern2 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<n;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		for(int k=1;k<=2*(n-i-1);k++){
			System.out.print(" ");
		}
		for(int l=1;l<=i;l++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<n-1;i++){
		for(int j=n-1-i;j>=1;j--){
			System.out.print("*");
		}
		for(int k=1;k<=(i*2);k++){
			System.out.print(" ");
		}
		for(int l=n-1-i;l>=1;l--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
