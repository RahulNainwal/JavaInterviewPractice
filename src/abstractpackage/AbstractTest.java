package abstractpackage;
abstract class Rahul{
	int id;
	String name;
	public Rahul(int id , String name) {
	this.id = id;
	this.name = name;
	}
	abstract void display(Rahul r);
	public void getVal(){
		System.out.println("Running....");
	}
}
public class AbstractTest extends Rahul {
public AbstractTest(int id, String name) {
		super(id, name);	}

public static void main(String[] args) {
	AbstractTest at = new AbstractTest(20, "Raja");
	at.display(at);
}

@Override
void display(Rahul r) {
	System.out.println(r.id+" "+r.name);
	}
}
