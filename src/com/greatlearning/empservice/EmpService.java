package com.greatlearning.empservice;

import java.util.Random;
import com.greatlearning.empmodel.EmployeeModel;

public class EmpService {
	
	public char[] generatePassword() {

		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String specialChars = "!@#$%^&*_=+-/.?<>)";

		String values = upperCase + lowerCase + nums + specialChars;
	
		// Using random method
		Random random = new Random();

		char[] pwd = new char[8];

		for (int i = 0; i < 8; i++) {
			// Use of charAt() method : to get character value
			// Use of nextInt() as it is scanning the value as int
			pwd[i] = values.charAt(random.nextInt(values.length()));

		}
		return pwd;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showEmpCredentials(EmployeeModel employee, String email, char[] generatedPwd) {
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email --> "+ email);
		System.out.print("Password --> 1"
				+ "");
		System.out.print(generatedPwd);
	}

}
