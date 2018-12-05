package String;

public class StringSorting {
	public static void main(String args[]){
	   String s = "bcfaed";
	   char a[]=s.toCharArray();
	   char b[]=new char[a.length];
	   int count=0;
	   for(int i=0;i<=a.length;i++)
	   {
	       for(int j=0+i;j<a.length;j++){
	       if(a[i]>a[j]){
	    	  char x = a[i];
	    	  a[i] = a[j];
	    	  a[j] =x;
	       }
	   } 
}
	   System.out.print(a);
}
}
