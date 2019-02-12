package constructor;

public class Student extends User {
private String roll_no;
private int classname;
private User user;
public String getRoll_no() {
	return roll_no;
}
public void setRoll_no(String roll_no) {
	this.roll_no = roll_no;
}
public int getClassname() {
	return classname;
}
public void setClassname(int classname) {
	this.classname = classname;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Student(String roll_no, int classname, User user) {
	super();
	this.roll_no = roll_no;
	this.classname = classname;
	this.user = user;
}

}
