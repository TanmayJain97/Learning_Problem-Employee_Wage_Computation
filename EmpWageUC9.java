import java.util.Random;

public class EmpWageUC9 {
	
	public static final int FullTime=1;				//Declaring Global Variables
	public static final int PartTime=2;
	
	private String CompName;						//variables are not kept static
	private int MaxWorkingDays; private int MaxWorkingHr;
	private int RatePerHr;
	private int MonthlyWage;
	
	public EmpWageUC9(String CompName,int RatePerHr,
			int MaxWorkingDays,int MaxWorkingHr) {
		
		this.CompName=CompName;
		this.RatePerHr=RatePerHr;
		this.MaxWorkingDays=MaxWorkingDays;
		this.MaxWorkingHr=MaxWorkingHr;
	}
	
	public void CalculateMonthlyWage() {
		
		Random ran = new Random();
		int EmpHr=0; int DailyWage;
		int DaysWorked=0; int HrsWorked=0;
		System.out.println("~~~"+CompName+"~~~");
		
		do { //Starting loop till condition fulfilled
		
			int EmpVal=ran.nextInt(3);			// Creating random int ranging 0 to 2
			DaysWorked++;
			System.out.println("Day: "+DaysWorked);
			
			switch(EmpVal) {
				case FullTime:
					System.out.println("Employee Present.");
					EmpHr=8;
					break;
				case PartTime:
					System.out.println("Employee Present but working Part Time.");
					EmpHr=8;
					break;
				default:
					System.out.println("Employee Absent.");
					EmpHr=0;
			}
			
			HrsWorked=HrsWorked+EmpHr;
			DailyWage=EmpHr*RatePerHr;
			MonthlyWage=DailyWage+MonthlyWage;
			System.out.println("Total Working Hours: "+HrsWorked);
			System.out.println("Employee daily wage is "+DailyWage);
		} while(DaysWorked<=MaxWorkingDays && HrsWorked<=MaxWorkingHr);
		System.out.println();
		System.out.println("Employee monthly wage is "+MonthlyWage);
		System.out.println();
	}

	@Override							//overriding parent method to display object creation
	public String toString() {
		return "Created entry for "+CompName;
	}
	
	public static void main(String[] args) {
		//creating object companies
		EmpWageUC9 dgg = new EmpWageUC9("DG Global",20,20,100);
		System.out.println(dgg);
		EmpWageUC9 mnm = new EmpWageUC9("Mahindra & Mahindra",10,14,200);
		System.out.println(mnm);
		EmpWageUC9 google = new EmpWageUC9("Google Inc.",50,12,80);
		System.out.println(google);
		
		//running method
		dgg.CalculateMonthlyWage();
		mnm.CalculateMonthlyWage();
		google.CalculateMonthlyWage();
	}
}