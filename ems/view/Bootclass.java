package com.flp.ems.view;
import java.util.Scanner;

public class Bootclass 
{
//	private static final int employee=0;
	public static void main(String [] args)
	{
		Scanner scanner=new Scanner(System.in); 
		System.out.println("1.Add Employee \n 2.Modify Employee \n 3.Remove Employee\n 4.Search Employee \n 5.get all Employee");
	int n=scanner.nextInt();
	menuselection(n);
	
		}
static void menuselection(int n)
{
	switch(n)
	{
	
	case 1:
		System.out.println("ADD EMPLOYEE");
		UserInteraction u1=new UserInteraction();
		u1.AddEmployee();
	break;
	case 2:
		System.out.println("MODIFY EMPLOYEE");
		UserInteraction u2=new UserInteraction();
		u2.ModifyEmployee();
	break;
	case 3:
		System.out.println("REMOVE EMPLOYEE");
		UserInteraction u3=new UserInteraction();
		u3.RemoveEmployee();
	break;
	case 4:
		System.out.println("SEARCH EMPLOYEE");
		UserInteraction u4=new UserInteraction();
		u4.SearchEmployee();
	break;
	case 5:
		System.out.println("GET ALL EMPLOYEE");
		UserInteraction u5=new UserInteraction();
		u5.SearchEmployee();
		break;
		
		default:
			System.out.println("value is default");
	break;
	}
	
	}
	
}
	

