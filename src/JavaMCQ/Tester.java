package JavaMCQ;

public class Tester {
 public static void print(Integer args){
	 System.out.println("Integer"+args);
 }
 public void print(int x){
	 System.out.println("INt");
 }
 public static void main(String[] args) {
	print(new Integer(3));
}
}
