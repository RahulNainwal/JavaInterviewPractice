package daffodil;
// find first prime number after a given number.
public class FirstPrimeAfterNumber {
	public static int repeat(int j){
		int count=0;
		for(int i=2;i<j/2;i++){
			if(j%i == 0){
				count++;
				break;
			}
		}
		if(count == 0){
			return j;
		}else{
			return repeat(j+1);
		}
	}
	public static void main(String[] args) {
		int i=91;
		System.out.println(FirstPrimeAfterNumber.repeat(i));
	}
}
