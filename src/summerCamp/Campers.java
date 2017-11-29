package summerCamp;

import java.util.*;

public class Campers implements Activities{
	String name;
	int houseNumber;
	String gender = null;
	int age;
	String activity = null;
	int numActivities;
	float activityFee;
	
	Scanner console = new Scanner(System.in);
	
	Campers()
	{
		name = getName();
		age = getAge();
		houseNumber = getHouseNumber();
		gender = getgender();
		numActivities = getNumActivities();
		activity = activities();
		activityFee = getActivityFee();
		
	}
	
	public String getName()
	{
		System.out.println("Enter name: ");
		name = console.next();
		return name;
	}
	
	public int getAge()
	{
		System.out.println("Enter age: ");
		age = console.nextInt();
		return age;
	}
	
	public int getHouseNumber()
	{
		System.out.println("Enter house number: ");
		houseNumber = console.nextInt();
		return houseNumber;
	}
	
	public String getgender()
	{
		System.out.println("gender (m=male/f=female): ");
		gender = console.next();
		
		while(!gender.equals("m")|| gender.equals("M")||gender.equals("F")||gender.equals("f"))
		{
			System.out.println("gender (m=male/f=female): ");
			gender = console.next();
		}
		return gender;
	}
	
	public int getNumActivities()
	{
		System.out.println("Number of activities (MAXIMUM IS 6/ MINIMUM IS 3): ");
		numActivities = console.nextInt();
		
		while(!(numActivities >= 3&&numActivities <=6))
		{
			System.out.println("MAXIMUM IS 6 AND MINIMUM IS 3: ");
			numActivities = console.nextInt();
		}
		return numActivities;
	}
	
	public String activities()
	{
		String act = null;	
		for(int i=0; i<numActivities; i++)
		{
		System.out.println("Choose activities joined: s-soccer r-rubgy b-basketball\nc-chess g-golf f-frisbee ro-rounders");
		act = console.next();		
		
		while(!(act.equals("s")||act.equals("r")||act.equals("b")||act.equals("c")||act.equals("g")||act.equals("f")||act.equals("ro")))
		{
			System.out.println("Not an activity");
			System.out.println("Please choose activities joined: s-soccer r-rubgy b-basketball\nc-chess g-golf f-frisbee ro-rounders");
			act = console.next();	
		}
		
			switch(act)
			{
			case "s":
				act = "Soccer ";
				break;
			case "r":
				act = "Rugby ";
				break;
			case "b":
				act = "basketball ";
				break;
			case "c":
				act = "Chess ";
				break;
			case "g":
				act = "Golf ";
				break;
			case "f":
				act = "Frisbee ";
				break;
			case "ro":
				act = "Rounders";
				break;
				
				default:
					System.out.println("Not an activity");
					break;
			}
			
			activity += act+" ";
		}
		
		return activity;			
	}
	
	public float getActivityFee()
	{
		activityFee = numActivities * FEE_PER_ACTIVITY;
		return activityFee;
	}
	
	public String display()
	{
		String s;
		s= "name "+name+ "\nAge "+age+"House Number "+houseNumber+"\ngender "+gender+"\nNum Act "+numActivities+"\nactivity "+activity
				+"\nactivity Fee: "+activityFee;
		return s;
	}
	
}
