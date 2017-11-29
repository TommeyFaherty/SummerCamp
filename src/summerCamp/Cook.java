package summerCamp;

public class Cook extends CampWorker {
	
	//Variable 
	float hoursPerWeek = 25;
	float hourlyRate = 12;
	
	//Constructor
	Cook()
	{
		super();
		weeklyWage = getWage();
	}
	
	//Methods
	public float getWage()
	{
		weeklyWage = hoursPerWeek*hourlyRate;
		return weeklyWage;
	}
	
	public String display()
	{
		String s;
		s = super.display();
		s += "\nWeekly Wage: "+weeklyWage;
		return s;
	}
}
