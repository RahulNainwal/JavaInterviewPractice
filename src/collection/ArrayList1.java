package collection;

import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList1 {
public static void main(String[] args) {
java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
list.add(123);
list.add(12);
list.add(1);
list.add(145);
list.add(16);
list.add(183);
list.add(1876);
list.add(1233);
list.add(1223);
System.out.println(list.size());
java.util.Iterator<Integer> i = list.iterator();
while(i.hasNext()){
	System.out.println(i.next());
}
for(int m=list.size()-1;m>1;m--){
		list.remove(m);
}
for(int n=0;n<list.size();n++){
	System.out.println(list.get(n));
}
}
}

