package summerCamp;

public class CampCounsilers extends CampWorker {
	//Variables
	int houseNumber;
	float hourlyRate = 10;
	int hoursPerWeek = 40;
	
	//Constructor
	CampCounsilers()
	{
		super();
		if(!(priorYears == 0))
		{
			houseNumber = getHouseNo();
			weeklyWage = getWage();
		}
		else
		{
			System.out.println("Not applicable for job.");
		}
		
	}
	
	//Methods	
	public int getHouseNo()
	{
		System.out.println("Enter House Number: ");
		houseNumber = console.nextInt();
		return houseNumber;
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
		s += "\nHouse Number: "+houseNumber+"\nWeekly Wage: "+weeklyWage;
		return s;
	}
}
