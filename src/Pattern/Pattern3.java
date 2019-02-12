package Pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int numRow = 5;
		for(int i=1;i<=numRow;i++){
			for(int j=1;j<=(numRow*2)-(i*2);j++){
				System.out.print(" ");
			}
			for(int k=1;k<=(i*2)-1;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
