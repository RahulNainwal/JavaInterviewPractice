package Pattern;

public class Pattern {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=6;i++){
		for(int j=1;j<=i;j++){
			System.out.print(count+1);
			if(i!=1 && i!=j){
				System.out.print("*");
			}
			count = count+1;
		}
		System.out.println();
	}
}
}
