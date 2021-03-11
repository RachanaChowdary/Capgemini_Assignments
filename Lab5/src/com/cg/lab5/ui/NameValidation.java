package com.cg.lab5.ui;
import java.util.Scanner;

public class NameValidation {

	public static void main(String[] args) throws LabException{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String fName = s.next();
		System.out.println("Enter last name: ");
		String lName = s.next();
		
		try {
			
			if(fName == null) {
				
				throw new LabException("The first name is not valid\n");
				
			} else {
				
				System.out.println("The first name is valid\n");
				
			}
			
		} catch(Exception e) {
			
			throw new LabException(e.getMessage());
			
		}
		
		try {
			
			if(lName == null) {
				
				throw new LabException("The last name is not valid\n");
				
			} else {
				
				System.out.println("The last name is valid\n");
				
			}
			
		} catch(Exception e) {
			
			throw new LabException(e.getMessage());
			
		}
		
		s.close();
	}

}