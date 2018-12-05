package daffodil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortString {
	public static void main(String[] args) {
		String name="RahulNainwal107";
		char[] name1=name.toCharArray();
		ArrayList<Character> LowerCase = new ArrayList<>();
		ArrayList<Character> UpperCase = new ArrayList<>();
		ArrayList<Integer> Number = new ArrayList<>();
		String sortedString = "";
		for(int i=0;i<name1.length;i++){
			if((int)name1[i]>=65 && (int)name1[i]<=90){
				UpperCase.add(name1[i]);
			}else if((int)name1[i]>=97 && (int)name1[i]<=122){
				LowerCase.add(name1[i]);
			}
			else{
				Number.add(Character.getNumericValue(name1[i]));
			}
		}
		for(int i=0;i<=LowerCase.size()-1;i++){
			for(int j=i+1;j<LowerCase.size();j++){
				if(LowerCase.get(i)>LowerCase.get(j)){
					char x=LowerCase.get(i);
					LowerCase.set(i, LowerCase.get(j));
					LowerCase.set(j, x);
				}
			}
			sortedString = sortedString + LowerCase.get(i).toString();
		}
		for(int i=0;i<=UpperCase.size()-1;i++){
			for(int j=i+1;j<UpperCase.size();j++){
				if(UpperCase.get(i)>UpperCase.get(j)){
					char x=UpperCase.get(i);
					UpperCase.set(i, UpperCase.get(j));
					UpperCase.set(j, x);
				}
			}
			sortedString = sortedString + UpperCase.get(i).toString();
		}
		for(int i=0;i<=Number.size()-1;i++){
			for(int j=i+1;j<Number.size();j++){
				if(Number.get(i)<Number.get(j)){
					int x=Number.get(i);
					Number.set(i, Number.get(j));
					Number.set(j, x);
				}
			}
			sortedString = sortedString + Number.get(i).toString();
		}
		System.out.println(sortedString);
	}
}
