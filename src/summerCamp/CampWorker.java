package summerCamp;

import java.util.*;

public abstract class CampWorker {
	
	//Variables
	String name;
	int age;
	float weeklyWage;
	
	Scanner console = new Scanner(System.in);
	
	//Constructor
	CampWorker()
	{
		name = getName();
		age = getAge();
	}
	
	//Methods
	public String getName()
	{
		System.out.println("Enter Name: ");
		name = console.next();
		return name;
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
		return s;
	}
	
}
