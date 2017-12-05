package summerCamp;

public interface Fees {
	float FEE_PER_ACTIVITY = 8;
	float CAMPHOUSE_FEE = 10;
	float MEDICAL_FEE = 25;
	float PROVISIONS_FEE = 120;
	
	public String activities();

	public float getActivityFee();
	
	
}
