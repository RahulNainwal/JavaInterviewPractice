package String;

// Write a java program to capitalize each word in string?
public class StringTest5 {
	public static void main(String[] args) {
		String s = "this is javatpoint";
		String s1 = new String();
		String[] str = s.split(" ");
		s1 = s1.concat(String.valueOf(s.charAt(0)).toUpperCase())+s.substring(1);
		/*for(int i=0;i<str.length;i++){
		char[] ch = str[i].toCharArray();
		ch[0]= Character.toUpperCase(ch[0]);
		str[i] = new String(ch);
		s1 = s1.concat(str[i]+" ");
		}*/
		System.out.println(s1.trim());
	}
}
