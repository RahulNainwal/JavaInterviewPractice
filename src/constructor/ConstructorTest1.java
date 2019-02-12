package constructor;

public class ConstructorTest1 {
	final int x ,y;
	public ConstructorTest1(int x,int y){
		this.x = x;
		this.y = y;
	}
public static void main(String[] args) {
	ConstructorTest1 c = new ConstructorTest1(10, 20);
	System.out.println(c.x+" "+c.y);
	ConstructorTest1 c1 = new ConstructorTest1(40, 70);
	c1.x =50;//error
	System.out.println(c1.x+" "+c1.y);
}
}
