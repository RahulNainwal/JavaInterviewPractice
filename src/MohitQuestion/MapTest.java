package MohitQuestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("12", 1);
		map.put("122", 19);
		map.put(" ", 1);
		map.put(null, 0);
		map.remove("12");
		System.out.println(map.get("122"));
		//System.out.println(map);
		for(Map.Entry<String, Integer> map1:map.entrySet()){
			System.out.println(map1);
		}
		
		int[] arr ={1,2,3,4,5,6,7,8};
		for(int i:arr)
			System.out.println(i);
	}
}
