package Pattern;

public class Pattern4 {
public static void main(String[] args) {
	int x=6,y=6;
	int z=0;
	for(int i=1;i<=x;i++){
		for(int j=x-z;j>=1;j--){
			System.out.print("*");
		}
		System.out.println();
		if(i % 2 == 0)
			z +=2;
	}
}
}
// OUTPUT:

// ******
// ******
// ****
// ****
// **
// **