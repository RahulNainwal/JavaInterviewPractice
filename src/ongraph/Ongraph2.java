package ongraph;
// count all number, space, and character from string.
public class Ongraph2 {
public static void main(String[] args) {
	String s = "rahul 10 08 95";
	int numCount=0,spaceCount=0,charCount=0;
	for(int i=0;i<s.length();i++){
		if(Character.isDigit(s.charAt(i))){
			numCount++;
		}
		else if(s.charAt(i) == ' '){
			spaceCount++;
		}
		else{
			charCount++;
		}
	}
	System.out.println("Number Count "+numCount+" Space Count "+spaceCount+" Character Count "+charCount);
}
}
