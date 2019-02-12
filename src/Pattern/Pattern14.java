package Pattern;

public class Pattern14 {
public static void main(String[] args) {
	for(int i=1;i<5;i++){
		for(int j=1;j<5-i;j++){
			System.out.print(" ");
		}
		for(int k=1;k<=(2 * i)-1;k++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<5;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		for(int k=1;k<=2*(4-i);k++){
			System.out.print(" ");
		}
		for(int l=1;l<=i;l++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int k=1;k<4;k++){
		for(int l=3;l>=k;l--){
			System.out.print("*");
		}
		for(int m=1;m<=2*(k);m++){
			System.out.print(" ");
		}
		for(int n=3;n>=k;n--){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=4;i>=1;i--){
		for(int j=4;j>i;j--){
			System.out.print(" ");
		}
		for(int k=(2*i)-1;k>=1;k--){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
