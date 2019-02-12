package HOME;

public class StringFrequency {
public static void main(String[] args) {
	String s = "rahulnainwalrahulnainwal";
	
	for(int i=0;i<s.length();i++){
		int count = 1;
		for(int j=i+1;j<s.length();j++){
			if(s.charAt(i) == s.charAt(j)){
				count++;
			}
		}
		System.out.println(s.charAt(i)+" "+count);
		String sub = s.substring(i+1, s.length());
		s = s.substring(0,i+1);
		sub = sub.replace(String.valueOf(s.charAt(i)), "");
		s = s.concat(sub);
	}
}
}
