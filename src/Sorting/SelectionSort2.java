package Sorting;

public class SelectionSort2 {
public static void main(String[] args) {
	String s = "dhdlfoehfefdubmndfndfAKAJPDFHFDFLDKFODIHFOI";
	System.out.println("Before Sorting "+s);
	char[] ch = s.toCharArray();
	for(int i=0;i<ch.length-1;i++){
		for(int j=i+1;j<ch.length;j++){
			if(Character.toLowerCase(ch[j])<Character.toLowerCase(ch[i])){
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
			}
		}
	}
	s = new String(ch);
	System.out.println("After sorting "+s);
}
}
