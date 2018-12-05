package daffodil;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class StringDaffodil {
public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("#.#");	
	String name="prakash chandra gupta";
	name=name.replace(" ", "");
	int length=name.length();
	String newStr="";
	for(int i=0;i<=length-1;i++){
		int count=1;
		if(newStr.contains(String.valueOf(name.charAt(i)))){
			continue;
		}else{
			for(int j=i+1;j<name.length();j++){
				if(name.charAt(i)==name.charAt(j)){
				count++;
				}
				newStr = newStr.concat(String.valueOf(name.charAt(i)));
			}
		}
		System.out.print(name.charAt(i)+""+count);
	}
}
}
