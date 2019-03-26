package rahul;
// Using static function and static method.
public class AddUsingFunction {
	static int m =50;// static variable.
	public static int addNum(int x,int y){//Static method.
		return x+y;
	}
public static void main(String[] args) {
	System.out.println(AddUsingFunction.m);
	AddUsingFunction.addNum(50, 100);// Using class name.method name or variable name we can access static variable and methods.
}
}
