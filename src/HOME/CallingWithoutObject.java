package HOME;

public class CallingWithoutObject {
	public static void main(String[] args) {
        B b = new B();
        b.x();
        A.z();
   }
}
class A{
    static String z(){
        System.out.println("a");
        return "sauarbh";
    }
}
class B{
    A a;
    A x(){
    return a;   
    }
}