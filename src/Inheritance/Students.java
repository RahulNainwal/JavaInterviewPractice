package Inheritance;

import java.util.Scanner;

class Students extends Person{
	private int[] testScores;
    private int total=0;
    private int averag;
    // Write your constructor here
        public Students(String fname,String lname,int id,int[] score){
            super(fname,lname,id);
            testScores = score;
        }
        
    // Write your method here
    char calculate(){
        for(int i=0;i<testScores.length;i++){
            total = total + testScores[i];
        }
        averag = total/(testScores.length);
        if(averag >= 90){
            return 'O';
        }
        else if(averag >= 80){
            return 'E';
        }
        else if(averag >= 70){
            return 'A';
        }
        else if(averag >= 55){
        return 'P';
        }
        else if(averag >= 40){
        return 'D';
        }
        else{
            return 'T';
        }
    }
}


