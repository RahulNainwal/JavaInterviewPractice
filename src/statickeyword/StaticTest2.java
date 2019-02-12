package statickeyword;

public class StaticTest2 {
	static int id=10;
static{
	System.out.println("In static");
	id++;
}
public static void main(String[] args) {
	System.out.println(StaticTest2.id);
	System.out.println(StaticTest2.id);
}
static{
	System.out.println("last static");
}
}
