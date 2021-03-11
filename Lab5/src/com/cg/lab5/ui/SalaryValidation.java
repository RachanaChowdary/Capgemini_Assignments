package com.cg.lab5.ui;

import java.util.Scanner;

public class SalaryValidation {

	public static void main(String[] args) throws EmployeeException{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary of the employee: ");
		double salary = s.nextDouble();
		
		try {
			
			if(salary < 3000) {
				
				throw new EmployeeException("The salary is below 3000 and is thus invalid");
				
			} else {
				
				System.out.println("The salary is valid");
				
			}
			
		} catch(Exception e) {
			
			throw new EmployeeException(e.getMessage());
			
		}
		
		s.close();

	}

}