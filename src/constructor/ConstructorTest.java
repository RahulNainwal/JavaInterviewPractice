package constructor;

public class ConstructorTest {
	public static void main(String[] args) {
		User user = new User("nainwal",1234,"Chamoli",3739);
		/*user.setAddress("naini");
		user.setId(1324);
		user.setName("rahul");
		user.setPin(246455);*/
		
		System.out.println(user.getAddress()+" "+user.getId()+" "+user.getName()+" "+user.getPin());
	}
}
