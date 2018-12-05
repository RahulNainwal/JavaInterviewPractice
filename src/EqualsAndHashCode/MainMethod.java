package EqualsAndHashCode;

import java.util.HashSet;

public class MainMethod {
public static void main(String[] args) {
	Student s1 = new Student(1, "rahul","naini");
	Student s2 = new Student(1, "rahul","naini");
	System.out.println(s1.equals(s2));
	HashSet<Student> studentSet = new HashSet<>();
	studentSet.add(s1);
	studentSet.add(s2);
	for(Student stu:studentSet){
		System.out.println("Id ="+stu.getId()+" Name="+stu.getName()+" Address="+stu.getAddress());
	}
	HashSet<Object> object = new HashSet<>();
	object.add("Rahul");
	object.add("Rahul");
	for(Student stu:studentSet){
		System.out.println(object.toString());
	}
}
}
