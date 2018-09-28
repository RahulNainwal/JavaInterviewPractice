package HOME;

public class LikeInterface {
	void run(){
		System.out.println("Running;;;.....");
	}

}
class classnew1{
	LikeInterface li = new LikeInterface();

	void run1(){
		li.run();
		System.out.println("Running 1 .....");
	}
}
class classnew2{
	public static void main(String args[]){
		classnew1 n1 = new classnew1();
		n1.run1();
	}
}
