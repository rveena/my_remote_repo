package com.flp.ems.view;
import java.util.*;
import java.util.Scanner;
import com.flp.ems.util.Validate;
import java.util.HashMap;

public class UserInteraction 
{
      Scanner sc=new Scanner(System.in);
	
	void AddEmployee()
	{
		System.out.println("employee id:");
		int employee_id=sc.nextInt();
		
		System.out.println(" name of the employee:");
		String name=sc.next();
	
		System.out.println(" kin_id:");
		int kin_id=sc.nextInt();

		System.out.println("enter date of birth");
		String birthdate=sc.next();
	
	  	System.out.println(" email id:");
		String email_id = sc.next();
		
		System.out.println(" address:");
		String address=sc.next();
		
		System.out.println("enter the date of joining");
		String joiningdate=sc.next();
		
		System.out.println("phone  Number:");
		int phone_number=sc.nextInt();
	
		System.out.println("department id:");
		int dept_id=sc.nextInt();
		
		System.out.println("project name:");
		String project_name=sc.next();
		
		System.out.println("projrct Id:");
		int project_id=sc.nextInt();
		
		System.out.println("Role in company:");
		String role=sc.next();		
	
		HashMap hm=new HashMap();
		
		if(Validate.validateDate(joiningdate)&&Validate.validateDate(birthdate))
		{
		hm.put(1, employee_id);
		hm.put(2, name);
		hm.put(3, kin_id);
		hm.put(4,birthdate);
		hm.put(5, email_id);
		hm.put(6, address);	
		hm.put(7, joiningdate);
		hm.put(8, phone_number);
		hm.put(9, dept_id);
		hm.put(10, project_name);
		hm.put(11, project_id);
		hm.put(12, role);
	}
	}
void ModifyEmployee()
{
	System.out.println("employee id:");
	int employee_id=sc.nextInt();
	
	System.out.println(" name of the employee:");
	String name=sc.next();

	System.out.println(" kin_id:");
	int kin_id=sc.nextInt();

	System.out.println("enter date of birth");
	String birthdate=sc.next();

  	System.out.println(" email id:");
	String email_id = sc.next();
	
	System.out.println(" address:");
	String address=sc.next();
	
	System.out.println("enter the date of joining");
	String joiningdate=sc.next();
	
	System.out.println("phone  Number:");
	int phone_number=sc.nextInt();

	System.out.println("department id:");
	int dept_id=sc.nextInt();
	
	System.out.println("project name:");
	String project_name=sc.next();
	
	System.out.println("projrct Id:");
	int project_id=sc.nextInt();
	
	System.out.println("Role in company:");
	String role=sc.next();		
	
	
}
void RemoveEmployee()
{
	
}
void SearchEmployee()
{
	
}
void getAllEmployee()
{
	
}
}
