package statickeyword;

// test for can we have local variable inside static methods; Ans is yes and example is here.
public class StaticTest1 {
	int x = 20;
	int y =40;
public static void main(String[] args) {
	int x = 10;
	int y = 20;
	System.out.println(x+" "+y);
			
}
public static void myFunction(){
	int x = 20;
	int y  = 30;
	System.out.println(x+y);
}
}
