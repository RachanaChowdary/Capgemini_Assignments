package com.cg.lab.ui;
import java.util.Scanner;

public class Exercise4{
	public static void main(String[] args){
		int m;
		int r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		m=s.nextInt();
		for(int i=2;i<m;i++){
			r=0;
			for(int j=2;j<i;j++){
				if(i%j==0)
				r=1;
			}
			if(r==0)
				System.out.println(i);
		}
		s.close();
	}
}