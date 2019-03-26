package GloballogicPractics;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 Adding the user in database (i.e. set) 
 if that user was not present in database (i.e. set) then print ‘yes’ or if user existed in database (i.e. set) then print ‘no’.
 */
public class CheckData {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new LinkedHashSet();
		int n = 5;
		String[] s = new String[n];
		System.out.println("Enter String Values ");
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		for(int i=0;i<s.length;i++){
			if(set.contains(s[i])){
				System.out.println("NO");
			}
			else{
				set.add(s[i]);
				System.out.println("YES");
			}
		}
	}
}
