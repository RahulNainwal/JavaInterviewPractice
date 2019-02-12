package collection;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TreeSetTest2 {
public static void main(String[] args) {
	TreeSet<String> tree = new TreeSet<>();
	tree.add("One");
	tree.add("two");
	tree.add("three");
	tree.add("four");
	tree.add("One");
	java.util.Iterator<String> i = tree.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
}
}
