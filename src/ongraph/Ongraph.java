package ongraph;

public class Ongraph {
	public static void main(String[] args) {
		String s = "ccccbbbbaaaa";
		int count = 1, count1 = 1, index = 0;
		for (int i = 0; i < s.length()-1; i++) {
			/*for (int j = i; j >= index; j--) {
				if(s.charAt(i) > s.charAt(j)) {
					count++;
					index++;
				}
			}*/
			if(s.charAt(i+1)>s.charAt(i)){
				count++;
			}
		}
		System.out.println("case " + count1 + " : " + count);
		count1++;
	}
}
