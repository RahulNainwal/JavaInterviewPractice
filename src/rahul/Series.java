package rahul;
// Series upto 10 which contains 2's divisor at even place and 1's divisor at odd place.
public class Series {
public static void main(String[] args) {
	int a=0,b=0;
	for(int i=0;i<10;i++){
		if(i%2==0){
			System.out.println(a);
			a = a + 2;
		}else{
			System.out.println(b);
			b = b + 1;
		}
	}
}
}
