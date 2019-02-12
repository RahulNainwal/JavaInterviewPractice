package datatype;

public class Test2 {
public static void main(String[] args) {
	String s = "rahul";
	String s1 = new String("rahul");
	System.out.println(s == s1);
	System.out.println(s.equals(s1));
	String s2 = "rahul";
	System.out.println(s == s2);
}
}
