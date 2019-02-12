package accessmodifyer;

class A{  
protected void msg(){System.out.println("Hello java");}  
}  
  // scope of overridden method in subclass always be less restrictive then superclass scope
public class Simple extends A{  
void msg(){System.out.println("Hello java");}//C.T.Error  here default is more restrictive then protected.
 public static void main(String args[]){  
   Simple obj=new Simple();  
   obj.msg();  
   }  
}  
