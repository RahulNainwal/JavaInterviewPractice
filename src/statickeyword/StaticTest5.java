package statickeyword;
// Can we have static variable inside methods  ANS:- NO 
public class StaticTest5 {
public static void main(String[] args) {
	static int x = 10;//Exception only final modifier is applicable with local variable
	final int x1= 10;
	System.out.println(x);
}
}
