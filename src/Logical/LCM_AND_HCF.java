package Logical;

import java.util.Scanner;

class LCM_HCF{
	int a,b;
	public int lcm_hcf(int num,int y){
		a = num;
		b= y;
		while(b!=0){
			int temp = b;
			//b = a / b;
			b = a % b;
			a = temp;
			
		}
		return a;
	}
	
}
public class LCM_AND_HCF {
	public static void main(String args[]){
		LCM_HCF lcm = new LCM_HCF();
		Scanner scanne = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scanne.nextInt();
		System.out.println("Enter number");
		int m = scanne.nextInt();
		System.out.println("LCM is :"+(m * n)/(lcm.lcm_hcf(n,m)));
		System.out.println("HCF is :"+lcm.lcm_hcf(n,m));
		
		
	}

}
