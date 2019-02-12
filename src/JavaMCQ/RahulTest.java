package JavaMCQ;

public class RahulTest {
	int x = 10;
	public void name(){
		this.x =15;
		//System.out.println(this.x);
	}
public static void main(String[] args) {
	RahulTest rt = new RahulTest();
	rt.name();
	for(int i=0;i<10;i++){
		System.out.println(rt.x);
	}
}
}
