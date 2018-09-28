package Multithreading;


class Threading_Testing extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{
	    	Thread.sleep(500);
	    	}
	    catch(InterruptedException e){
	    	System.out.println(e);
	    	}  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]){  
		 Threading_Testing t1=new Threading_Testing();  
		 Threading_Testing t2=new Threading_Testing();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  