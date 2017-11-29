package summerCamp;

public class CampManager extends CampWorker{
	
	int numOfWorkers;
	int totalHoursOfWorkers;
	float activityCosts;
	float payWorkers;
	
	CampManager()
	{
		super();
		numOfWorkers = getNumOfWorkers();
		totalHoursOfWorkers = getHoursOfWorkers();
		activityCosts = getActivityCosts();
	}
	
	public int getNumOfWorkers()
	{
		System.out.println("Enter Number of workers employeed:");
		numOfWorkers = console.nextInt();
		return numOfWorkers;
	}

	public int getHoursOfWorkers()
	{
		System.out.println("Enter Total amount of Hours worked by workers: ");
		totalHoursOfWorkers = console.nextInt();
		return totalHoursOfWorkers;
	}
	
	public float getActivityCosts()
	{
		activityCosts = 20;
		return activityCosts;
	}
	
	public String display()
	{
		String s = super.display();
		s += "\nNumber of workers" + numOfWorkers;
		s += "\nTotal amount of hours worked by workers"+totalHoursOfWorkers;
		return s;
	}
}
