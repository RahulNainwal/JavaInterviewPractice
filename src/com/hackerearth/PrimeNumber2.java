package com.hackerearth;

import java.util.Scanner;
class PrimeNumber2 {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
 
        for (int i = 2; i <= N; i++) {
            boolean flag=false;
           for(int j=2;j<=Math.sqrt(i);j++)
             {
               if(i%j ==0)
               {
                   flag=true;
                   break;
               }
             }
             if(flag==false)
             {
                 System.out.print(i+" ");
             }
        }
        
    }
}