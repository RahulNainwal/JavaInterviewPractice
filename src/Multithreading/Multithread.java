package Multithreading;

//Java code for thread creation by extending
//the Thread class
class MultithreadingDemo extends Thread
{
 public void run()
 {
     try
     {
         // Displaying the thread that is running
         System.out.println ("Thread " +
               Thread.currentThread().getId() +
               " is running");

     }
     catch (Exception e)
     {
         // Throwing an exception
         System.out.println ("Exception is caught");
     }
 }
}

//Main Class
public class Multithread extends Thread
{
	public void run()
	 {
	     try
	     {
	         // Displaying the thread that is running
	         System.out.println ("Thread " +
	               Thread.currentThread().getId() +
	               " is running in second ");

	     }
	     catch (Exception e)
	     {
	         // Throwing an exception
	         System.out.println ("Exception is caught");
	     }
	 }
	
 public static void main(String[] args)
 {
	
     int n = 8; // Number of threads
     for (int i=0; i<8; i++)
     {
         MultithreadingDemo object = new MultithreadingDemo();
         Multithread multi = new Multithread();
         /*multi.start();
         object.start();*/
         multi.start();
         try{
        	 multi.join();
         }catch (Exception e) {
			System.out.println(e);
		}
         object.start();
     }
 }
}
