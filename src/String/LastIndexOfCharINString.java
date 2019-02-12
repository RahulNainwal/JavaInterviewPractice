package String;

public class LastIndexOfCharINString {
public static void main(String[] args) {
	String name ="Rahul Nainwal";
	char x = 'a';
	int lastIndex=0;
	for(int i=0;i<name.length();i++){
		if(name.charAt(i)==x){
			lastIndex = i;
			//break; for first index
 		}
	}
	System.out.println("Last Index of "+x+" = "+lastIndex);
}
}
