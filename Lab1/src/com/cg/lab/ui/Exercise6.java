package com.cg.lab.ui;


import java.util.Scanner;

public class Exercise6 {
	int i;
	int sum=0;
	int j;
	int sum1;
	public int squares() {
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
	
		for(int i=1;i<=n;i++){
			
			sum=sum+i*i;
			
		}
		    scan.close();
			System.out.println("sum of sqaures is:" +sum);
			for(int j=0;j<=n;j++) {
				sum1=sum1+j;
			}
		int c= sum1*sum1;
		System.out.println("square of sum is:" +c);
		int difference=c-sum;
		System.out.println("difference is:" +difference);
		return n;
		
	}
	public static void main(String args[]){
		Exercise6 s= new Exercise6();
		s.squares();
		}
}