package main;

// we an change the order of access specifier 
// we can change args to any variable.
// we can change String[] args to String []args,String args[],String[] args.
public class Test1 {
public static synchronized void main(String[] args) {
	System.out.println("Synchronized modifyer ia applicable for main method");
}
}
