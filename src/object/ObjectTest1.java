package object;

public class ObjectTest1 {
public static void main(String[] args) {
	ObjectTest1 oj = new ObjectTest1();
	ObjectTest1 oj1 = new ObjectTest1();
	System.out.println(oj.getClass());
	System.out.println(oj.hashCode());
	System.out.println(oj1.hashCode());
	System.out.println(oj.equals(oj1));
	int i=10;
	int j=10;
	System.out.println(i==j);
	String s="rahul";
	String s2="rahul";
	System.out.println(s==s2);
	System.out.println(s.equals(s2));
	String s3="rahul";
	String s4=new String("rahul");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	System.out.println(s3.c));
}
}
