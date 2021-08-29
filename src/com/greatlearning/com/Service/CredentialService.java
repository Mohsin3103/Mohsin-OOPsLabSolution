package com.greatlearning.com.Service;
import com.greatlearning.com.Employee.*;
import java.util.Random;

public class CredentialService {
	public String generateEmailAddress(Employee emp) {
		
		
		return emp.getFirstName() + emp.getLastName() +"." + emp.getDepartment() +  "@" + "abc.com";
		
	}
	public String generatePassword() {
		Random random = new Random();
		
		// generate a random password of length 8 characters
		String allowedChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$*()?.=+^&*<>";
		
		char[] password = new char[8];
		
		for( int i = 0; i < 8; i++ ) {
			int idx = random.nextInt( allowedChars.length() ); // generates an integer between 0 - length of allowedChars string
			password[i] = allowedChars.charAt( idx );
		}
		
		return new String( password );
	}
	
    
	public void showCredetials( Employee emp, String email, String password ) {
		
		
	}

}
