package collection;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetTest {
public static void main(String[] args) {
	TreeSet tree = new TreeSet<>();
	tree.add(1);
	tree.add(2);
	tree.add(10);
	java.util.Iterator i=tree.iterator();  
	while(i.hasNext()){
		System.out.println(i.next());
	}
}
}
