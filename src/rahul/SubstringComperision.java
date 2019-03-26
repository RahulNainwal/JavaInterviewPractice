package rahul;

import java.util.ArrayList;

public class SubstringComperision {
public static void main(String[] args) {
	String s = "welcometojava";
	int k = 3;
	String smallest="",largest="";
	//first approach
	/*ArrayList<String> list = new ArrayList<>();
	for(int i=0;i<=s.length()-3;i++){
		list.add(s.substring(i, i+3));
	}
	for(int i=0;i<=list.size()-1;i++){
		for(int j=i+1;j<list.size();j++){
			if(list.get(i).compareTo(list.get(j))>0){
				String x = list.get(i);
				list.set(i, list.get(j));
				list.set(j, x);
			}
		}
	}
	System.out.println(list.get(0)+"\n"+list.get(list.size()-1));*/
	
	//Second Approach
	/*for (int i = 0; i <= s.length()-k; i++) {
            if (s.substring(i,i+k).compareTo(largest) > 0) {
                largest = s.substring(i,i+k);
            }else{
                smallest = s.substring(i,i+k);
            }
    }
	System.out.println(smallest+" "+largest);*/
	
	
}
}
