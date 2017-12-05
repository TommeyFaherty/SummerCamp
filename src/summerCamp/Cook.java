package summerCamp;

public class Cook extends CampWorker {
	
	//Variable 
	float hoursPerWeek = 25;
	float hourlyRate = 12;
	float weeklyWage;
	String cookPosition;
	
	//Constructor
	Cook()
	{
		super();
		if(!(priorYears == 0))
		{
			
			cookPosition = getCookType();
			weeklyWage = getWage();
		}
		else
		{
			System.out.println("Not applicable for job.");
		}
	}
	
	//Methods
	public String getCookType()
	{
		System.out.println("Which of the cooking staff positions are you looking to join?\nPorter - p\nCook - c\nServer - s");
		cookPosition = console.next();
		while(!(cookPosition.equals("s")||cookPosition.equals("S")||cookPosition.equals("c")||cookPosition.equals("C")||cookPosition.equals("p")||cookPosition.equals("P")))
		{
			System.out.println("Position entered does not exist.\nTry Again.");
		}
		
		switch(cookPosition)
		{
		case "p":
		case "P":
			cookPosition = "Porter";
			System.out.println("Your main tasks will include cleaning dishes and replacing plates and cutlery.");
			break;
		case "s":
		case "S":
			cookPosition = "Server";
			System.out.println("Your main tasks will include serving food and answering questions on the food.");
			break;
		case "c":
		case "C":
			cookPosition = "Cook";
			System.out.println("Your main tasks will include cooking the meals highlighted on the schedule.");
			break;
		}
		
		return cookPosition;
	}
	
	public float getWage()
	{
		System.out.println("Getting wage...");
		weeklyWage = hoursPerWeek*hourlyRate;
		return weeklyWage;
	}
	
	public String display()
	{
		String s;
		s = super.display();
		s += "\nYears of experience: "+priorYears;
		s += "\nWeekly Wage: "+weeklyWage;
		return s;
	}
}
