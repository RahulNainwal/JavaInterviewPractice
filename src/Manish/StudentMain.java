package Manish;

import java.util.HashMap;

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {

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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

class MyDetails extends Student {
	private String address;

	HashMap<Integer, Student> map = new HashMap<>();

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*
	 * public MyDetails(int id, String name, String address) { super(id, name);
	 * this.address = address; }
	 */
	public MyDetails(String address) {
		this.address = address;
	}

	public Student showDetails(int id, String name) {
		return new Student(id, name);

	}

	/*public HashMap<Integer, Student> studentDetails() {
		map.put(1, this.showDetails());
		return map;
	}*/
	public HashMap<Integer, Student> studentDetails() {
		map.put(1, this.showDetails(super.getId(), super.getName()));
		return map;
	}

	@Override
	public String toString() {
		return "MyDetails [address=" + address + ", map=" + studentDetails() + "]";
	}

}

class StudentMain {
	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<>();

		MyDetails md = new MyDetails("naini");
		MyDetails md1 = new MyDetails("uttarakhand");
		MyDetails md2 = new MyDetails("srinagar");
		MyDetails md3 = new MyDetails("pauri");

		map.put(1, md.showDetails(1, "rahul"));
		map.put(2, md1.showDetails(2, "rishi"));
		map.put(3, md2.showDetails(3, "ranjan"));
		map.put(4, md3.showDetails(4, "rajeev"));
		System.out.println(map);

		/*
		 * System.out.println(md.studentDetails());
		 * System.out.println(md1.studentDetails());
		 * System.out.println(md2.studentDetails());
		 * System.out.println(md3.studentDetails());
		 */
	}
}
