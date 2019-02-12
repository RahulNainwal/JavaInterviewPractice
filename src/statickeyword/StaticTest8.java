package statickeyword;

public class StaticTest8 {
	static int x;//error
	x=100;
	static{
		x =100;
	}
public static void main(String[] args) {
	
	System.out.println(x);
}
}
