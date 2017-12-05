package summerCamp;

import java.util.*;

public abstract class CampWorker {
	
	//Variables
	String name;
	int age;
	float weeklyWage;
	int priorYears;
	
	Scanner console = new Scanner(System.in);
	
	//Constructor
	CampWorker()
	{
		name = getName();
		age = getAge();
		priorYears = getYears();
	}
	
	//Methods
	public String getName()
	{
		System.out.println("Enter Name: ");
		name = console.next();
		return name;
	}
	
	public int getYears()
	{
		System.out.println("Enter number of years experience you have: ");
		priorYears = console.nextInt();

		if(priorYears < 2)
		{
			System.out.println("3 Years is the minimum required experience to work here.");
			priorYears = 0;
		}
		return priorYears;
	}
	
	public int getAge()
	{
		System.out.println("Enter age: ");
		age = console.nextInt();
		return age;
	}
	
	public String display()
	{
		String s;
		s = "Name: "+name ;
		s += "\nAge: "+age;
		return s;
	}
	
}
