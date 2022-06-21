package com.greatlearning.empservice;

import java.util.Scanner;
import com.greatlearning.empmodel.EmployeeModel;

public class EmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeModel emp = new EmployeeModel("Kalyana Geethika", "Ginni");
		EmpService es = new EmpService();
		String generatedEmail;
		char[] generatedPwd;

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		if (option == 1) {
			generatedEmail = es.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "tech");
			generatedPwd = es.generatePassword();
			es.showEmpCredentials(emp, generatedEmail, generatedPwd);
		}
		
		else if (option == 2) {
			generatedEmail = es.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "adm");
			generatedPwd = es.generatePassword();
			es.showEmpCredentials(emp, generatedEmail, generatedPwd);
		}
		
		else if (option == 3) {
			generatedEmail = es.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "hr");
			generatedPwd = es.generatePassword();
			es.showEmpCredentials(emp, generatedEmail, generatedPwd);
		}

		else if (option == 4) {
			generatedEmail = es.generateEmailAddress(emp.getFirstName().toLowerCase(),
					emp.getLastName().toLowerCase(), "lg");
			generatedPwd = es.generatePassword();
			es.showEmpCredentials(emp, generatedEmail, generatedPwd);
		}
		
		else
			System.out.println("Enter a valid option");
		
		sc.close();
	}

}
