package Interview;

public class EquqlandDoubleEqual {
public static void main(String[] args) {
	String s = new String("Rahul");
	String s1 = new String("Rahul");
	String s2 = "Nainwal";
	String s3 = "Nainwal";
	//String s1 = s
	System.out.println(s.equals(s1)); // equals() is used to compare content .
	System.out.println(s == s1); //== operator compares reference or memory location of objects in the heap,whether they point to the same location or not.
	System.out.println(s2 == s3);
}
}
