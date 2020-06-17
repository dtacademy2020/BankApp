package bankApp;

public interface BaseInterestRate {

double baseRate = 2.5;
	
	default double getBaseRate() {
		return baseRate;
	}
	
	void setInterestRate();

	
	double getInterestRate();
}
