package com.cg.lab.ui;
import java.util.Scanner;

public class Exercise1{
	int i;
	int sum=0;
	public int cubes(){
	Scanner scan=new Scanner(System.in);
	int m=scan.nextInt();
	for(int i=1;i<=m;i++)
	{
		sum=sum+(i*i*i);
	}
		System.out.println(sum);
		scan.close();
	return m;
	}
	public static void main(String args[]){
		Exercise1 s=new Exercise1();
		s.cubes();
	}
}
