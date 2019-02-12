package String;

public class LengthOfString {
public static void main(String[] args) {
	String s="Rahul";
	char[] ch = s.toCharArray();
	int count=0;
	for(char c:ch){
		count++;
	}
	System.out.println(count);
}
}
