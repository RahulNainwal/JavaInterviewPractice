package WorkingWithFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class NameRoll extends Thread{
	@Override
	public void run() {
		final File parentDir = new File("C:/Users/rahul/Downloads");
		parentDir.mkdir();
		final String hash = "abc";
		final String fileName = hash + ".txt";
		final File file = new File(parentDir, fileName);
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Creates file crawl_html/abc.txt
		//System.out.println(generateRand());
		
		try {
			
			File file1 = new File("C:/Users/rahul/Downloads/abc.txt");
			FileWriter fw = new FileWriter(file1,true); 
			 //System.out.println(generateRand());
	           fw.write(generateRand()+" ");    
	           fw.close(); 
	          
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	int generateRand(){
		int number = 0;
			Random rand = new Random();
			number = 1000 + rand.nextInt(1000);
		
		//System.out.println(number);
		return number;
	}
}

public class GenerateFile {
	public static void main(String args[]) throws InterruptedException, IOException{
	
	 for (int x=0; x<500; x++)
	    {
		 	NameRoll nameroll = new NameRoll();
		 	nameroll.start();
		 	nameroll.join();
	        System.out.println("Started Thread:" + x);
	    }
	 /*BufferedReader br = new BufferedReader(new FileReader("C:/Users/rahul/Downloads/abc.txt"));
	 String data;
	 data = br.readLine();
	 while (data != null) {
		 System.out.println(data);
	}*/
		File file1 = new File("C:/Users/rahul/Downloads/abc.txt");
		  BufferedReader br = new BufferedReader(new FileReader(file1)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		  } 

	}