package polymorphism;

class Bike{  
	 int speedlimit=90;  
	}  
	class Polymorphism1 extends Bike{  
	 int speedlimit=150; 
	 public Polymorphism1() {
		 int speedlimit=250;
	 }
	  
	 public static void main(String args[]){  
	  Bike obj=new Polymorphism1();  
	  System.out.println(obj.speedlimit);//90  
	}  
}