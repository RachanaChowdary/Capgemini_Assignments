package com.cg.lab.ui;

import java.util.Scanner;

public class Exercise5 { 
	int sum=0;
	public int calculateSum()
	{
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();  
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		scan.close();
		return n;
}
		
		public static void main(String args[]){
			Exercise5 s=new Exercise5();
			s.calculateSum(); 
		}
}

