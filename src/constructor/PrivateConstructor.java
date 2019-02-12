package constructor;

public class PrivateConstructor {
	int x,y;
	private PrivateConstructor(int x,int y){
		this.x = x;
		this.y = y;
	}
	// private constructor is use to create singleton class.
public static void main(String[] args) {
	PrivateConstructor pc = new PrivateConstructor(10, 20);
	System.out.println(pc.x+" "+pc.y);
	PrivateConstructor pc1 = new PrivateConstructor(34, 23);
	System.out.println(pc1.x+" "+pc1.y);
}
}
