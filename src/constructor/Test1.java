package constructor;

class C1 {
	private int id;
	private String name;

	public C1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class C2 extends C1 {
	private int pin;
	private String address;

	public C2(int id, String name, int pin, String address) {
		super(id, name);
		this.pin = pin;
		this.address = address;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class Test1 {
	public static void main(String[] args) {
		C2 c2 = new C2(1,"rahul",246455,"chamoli");
		System.out.println(c2.getId()+" "+c2.getAddress()+" "+c2.getPin()+" "+c2.getName());
	}
}
