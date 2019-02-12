package constructor;

public class User {
private String name;
private int id;
private String address;
private int pin;
public User() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public User(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
public User(String name, int id, String address, int pin) {
	this(name,id);
	this.address = address;
	this.pin = pin;
}

}
