package com.greatlearning.com.Main;
import java.util.Scanner;
import com.greatlearning.com.Employee.*;
import com.greatlearning.com.Service.CredentialService;




public class Driver {
	private static final Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
	
		System.out.println("First name : ");
	    String FirstName = sc.next();

	   System.out.println("Last name : ");
       String LastName = sc.next();
       
       System.out.println("Choose your department : ");
       System.out.println("1. Technical");
       System.out.println("2. Admin");
       System.out.println("3. Human Resources");
       System.out.println("4. Legal");

       int choice = sc.nextInt();
       
       Employee emp;
       
       switch (choice) 
       {
    	   case 1: 
    		   emp = new Employee (FirstName, LastName , "tech");
    		   break;
    	   case 2: 
    		   emp = new Employee (FirstName, LastName , "adm");
    		   break;
    	   
    	   case 3: 
    		   emp = new Employee (FirstName, LastName , "hr");
    		   break;
    	   case 4: 
    		   emp = new Employee (FirstName, LastName , "lg");
    		   break;
    	  default :
    		  System.out.println ("Incorrect Choice");
    			   
    			   
    		   return;

    	   
       }
       //
       CredentialService cs = new CredentialService();
       String email= cs.generateEmailAddress(emp);
       System.out.println (email);
       String password = cs.generatePassword();
		System.out.println( password );
}
}