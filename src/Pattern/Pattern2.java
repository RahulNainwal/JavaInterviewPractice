package Pattern;

public class Pattern2 {
public static void main(String[] args) {
	for(int i=1;i<=3;i++){
		for(int j=1;j<=(3-i)*2;j++){
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i)-1;k++){
			System.out.print(k+" ");
		}
		System.out.println();
	}
	
}
}
