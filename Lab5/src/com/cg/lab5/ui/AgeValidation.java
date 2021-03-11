package com.cg.lab5.ui;

import java.util.Scanner;

public class AgeValidation {
	
	public static void main(String[] args) throws LabException{
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int age = s.nextInt();
  
		try {
				if(age < 15) {
				
					throw new LabException("Age is invalid");
				
				} else {
				
					System.out.println("The age is valid");
				
				} 
			} catch (LabException e) {
				
				throw new LabException(e.getMessage());
			}
		
		s.close();
	}
}