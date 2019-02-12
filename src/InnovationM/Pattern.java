package InnovationM;

public class Pattern {
public static void main(String[] args) {
	int n=5;
	for(int i=5;i>=1;i--){
		for(int j=5;j>i;j--){
			System.out.print(" ");
		}
		for(int k=(i*2)-1;k>=1;k--){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++){
		for(int j=5;j>i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=(i*2)-1;k++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
