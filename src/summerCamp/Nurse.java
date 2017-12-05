package summerCamp;

public class Nurse extends CampWorker{
	
	//Variables
	float hoursPerWeek = 40;
	float hourlyRate = 12;
	float weeklyWage;
	
	Nurse()
	{
		super();
		if(!(priorYears == 0))
		{
			weeklyWage = getWage();
		}
		else
		{
			System.out.println("Not applicable for job.");
		}
	}
	
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
