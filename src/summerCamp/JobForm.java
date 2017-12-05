package summerCamp;

import java.util.*;

public class JobForm {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		String job;
		System.out.println("Which position are you applying for?\nC - Cook\nN - Nurse\nT - Team Leader");
		job = console.next();
		
		while(!(job.equals("c")|| job.equals("n") || job.equals("t") || job.equals("T") || job.equals("N") || job.equals("C")))
		{
			System.out.println("Letter entered is not a position. Try again.");
			job = console.next();
		}
		
		switch (job)
		{
		case "c":
		case "C":
			//Cook
			Cook worker3 = new Cook();
			System.out.println(worker3.display());
			break;
			
		case "t":
		case "T":
			//Camp Counsiler
			CampWorker worker2 = new CampCounsilers();
			System.out.println(worker2.display());
			break;
			
		case "n":
		case "N":
			//Nurse 
			CampWorker worker4 = new Nurse();
			System.out.println(worker4.display());
			break;
		}

	}

}
