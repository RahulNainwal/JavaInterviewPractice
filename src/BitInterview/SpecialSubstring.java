package BitInterview;

import java.util.ArrayList;

public class SpecialSubstring {
public static void main(String[] args) {
	int value =1;
	String str = "bcccabbabc";
	 for(int i=0;i<str.length();i++){
		 if(str.charAt(i)==str.charAt(0)){
			 System.out.println(i+1);
			 for(int k=i+1;k>0;k--){
				 value *=k;
			 }
		 }
	 }
	 System.out.println(value);
}
}
