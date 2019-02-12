package String;

public class Stringtest3 {
public static void main(String[] args) {
	String s = "rahul";
	String s1 = new String("rahul");
	System.out.println(s.hashCode()+" "+s1.hashCode());
	System.out.println(s=s1);
	System.out.println(s == new String(s1));
	System.out.println(s.matches(s1));
	System.out.println(s1.hashCode() == s.hashCode());
}
}
