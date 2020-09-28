import java.util.*;

public class CompanyEmpWage {
	
	public final String CompName;			//Global characteristic for Comp obj.
	public final int MaxWorkingDays;
	public final int MaxWorkingHr;
	public final int RatePerHr;
	public int MonthlyWage;
	public ArrayList<Integer> dailyWageList;		//For UC 13
	
	public CompanyEmpWage(String compName, int ratePerHr,
			int maxWorkingDays, int maxWorkingHr) {
		
		this.CompName = compName;				//Constructor
		this.MaxWorkingDays = maxWorkingDays;
		this.MaxWorkingHr = maxWorkingHr;
		this.RatePerHr = ratePerHr;
		this.dailyWageList=new ArrayList<Integer>();
	}
	
	public void getDailyWage() {			//For UC 13 and 14
		System.out.println(dailyWageList); 
	}
	
	public void setDailyWage(int DailyWage) {			//For UC 13 and 14
		dailyWageList.add(DailyWage);
	}
	
	public void setMonthlyWage(int MonthlyWage) {
		this.MonthlyWage=MonthlyWage;
	}

	@Override									//overriding parent method to display object creation
	public String toString() {
		return ("Created an object for company "+CompName);
	}
}
