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
		gender = getgender();
		houseNumber = getHouseNumber();
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
		System.out.println("Enter house number (1-10): ");
		houseNumber = console.nextInt();
		String animal = null;
		
		//ensure is a real house
		while(!(houseNumber > 0 && houseNumber < 11))
		{
			System.out.println("House numbers are only between 1-10");
			houseNumber = console.nextInt();
		}
		
		//Ensure gender and hous number match up
		if(gender.equals("m") || gender.equals("M"))
		{
			while(!(houseNumber > 0 && houseNumber < 6))
			{
				System.out.println("You have eneterd an all girls house for your male child.\nBoys house numbers are between 1-5");
				houseNumber = console.nextInt();
			}
		}
		else
		{
			while(!(houseNumber > 5 && houseNumber < 11))
			{
				System.out.println("You have eneterd an all boys house for your female child.\nGirls house numbers are between 5-10");
				houseNumber = console.nextInt();
			}
		}
		
		//Get house animal
		switch(houseNumber)
		{
		case 1: 
			animal = "Lion";
			break;
		case 2: 
			animal = "Eagal";
			break;
		case 3: 
			animal = "Rhino";
			break;
		case 4:
			animal = "Panda";
			break;
		case 5:
			animal = "Viper";
			break;
		case 6: 
			animal = "Tiger";
			break;
		case 7:
			animal = "koala";
			break;
		case 8:
			animal = "Bear";
			break;
		case 9: 
			animal = "Wolf";
			break;
		case 10:
			animal = "Cheetah";
			break;	
		}
		
		//Separate boys and girls
		if(houseNumber >0 && houseNumber <6)
			System.out.println("Welcome to the all boys house.\nTeam "+animal+", number "+houseNumber);
		
		else
			System.out.println("Welcome to the all girls house.\nTeam "+animal+", number "+houseNumber);
		
		return houseNumber;
	}
	
	public String getgender()
	{
		System.out.println("gender (m=male/f=female): ");
		gender = console.next();
		
		while(!gender.equals("m")|| gender.equals("M")||gender.equals("F")||gender.equals("f"))
		{
			System.out.println("Please enter an 'm' or an 'f'.  m=male/f=female ");
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
		
		System.out.println("Choose activities joined: s-soccer r-rubgy b-basketball\nc-chess g-golf f-frisbee ro-rounders");
		System.out.println("1: ");
		act = console.next();	
		
		for(int i=0; i<numActivities - 1; i++)
		{
			System.out.println(i+2+": ");
			act = console.next();		
			
			while(!(act.equals("s")||act.equals("r")||act.equals("b")||act.equals("c")||act.equals("g")||act.equals("f")||act.equals("ro")))
			{
				System.out.println("Not an activity");
				System.out.println("Activities include: s-soccer r-rubgy b-basketball\nc-chess g-golf f-frisbee ro-rounders");
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
