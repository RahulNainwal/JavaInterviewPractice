package collection;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList {
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
java.util.Iterator<Integer> itr = list.iterator(); 
while (itr.hasNext()) 
{ 
    int x = (Integer)itr.next(); 
    if (x > 1000) // Remove elements greater than 1000 using
        itr.remove(); 
} 
System.out.println(list.size());
java.util.Iterator<Integer> i1 = list.iterator();
while(i1.hasNext()){
	System.out.println(i1.next());
}
}
}
