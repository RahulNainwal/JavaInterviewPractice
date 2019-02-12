package polymorphism;

class Prson{
	private String name;
	private String email;
	private String address;
	private int classname;
	public Prson(String name, String email, String address, int classname) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.classname = classname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getClassname() {
		return classname;
	}
	public void setClassname(int classname) {
		this.classname = classname;
	}
	public void display(){
		System.out.println(name+" "+email+" "+address+" "+classname);
	}
}
class Stu1 extends Prson{
	public Stu1(String name, String email, String address, int classname) {
		super(name, email, address, classname);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void display() {
		System.out.println(super.getEmail()+" "+super.getName());
	}
	public void name(){
		System.out.println(super.getName());
	}
	
}
public class PolymorphismTest {
public static void main(String[] args) {
	Prson p = new Stu1("Rahul", "rahulnainwal7@gmail.com", "Naini", 3);
	p.display();
	// p.name(); // It will show error because when we create referance of parent class we can't call method of subclass.we only can call methods of parent class 
}
}
