import java.util.Random;

public class EmpWageUC8 {
	
	public static final int FullTime=1;				//Declaring Global Variables
	public static final int PartTime=2;
	
	public static void CalculateMonthlyWage(String CompName,int RatePerHr,
			int MaxWorkingDays,int MaxWorkingHr) {
		
		Random ran = new Random();
		int EmpHr=0; int DailyWage; int MonthlyWage=0;
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

	public static void main(String[] args) {
		CalculateMonthlyWage("DG Global",20,20,100);
		CalculateMonthlyWage("Mahindra & Mahindra",10,14,200);
		CalculateMonthlyWage("Google Inc.",50,12,80);
	}
}