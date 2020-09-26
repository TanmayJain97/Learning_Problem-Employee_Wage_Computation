
public class CompanyEmpWage {
	
	public final String CompName;			//Global characteristic for Comp obj.
	public final int MaxWorkingDays;
	public final int MaxWorkingHr;
	public final int RatePerHr;
	public int MonthlyWage;
	
	public CompanyEmpWage(String compName, int ratePerHr,
			int maxWorkingDays, int maxWorkingHr) {
		
		this.CompName = compName;				//Constructor
		this.MaxWorkingDays = maxWorkingDays;
		this.MaxWorkingHr = maxWorkingHr;
		this.RatePerHr = ratePerHr;
	}
	
	public void setMonthlyWage(int MonthlyWage) {
		this.MonthlyWage=MonthlyWage;
	}

	@Override									//overriding parent method to display object creation
	public String toString() {
		return ("Created an object for company "+CompName);
	}
}
