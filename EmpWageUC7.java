import java.util.Random;

public class EmpWageUC7 {
	
	public static final int FullTime=1;				//Declaring Global Variables
	public static final int PartTime=2;
	public static final int RatePerHr=20;
	public static final int MaxWorkingDays=20;
	public static final int MaxWorkingHr=100;
	
	public static void CalculateMonthlyWage() {
		
		Random ran = new Random();
		int EmpHr=0; int DailyWage; int MonthlyWage=0;
		int DaysWorked=0; int HrsWorked=0;
		
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
	}

	public static void main(String[] args) {
		CalculateMonthlyWage();
	}
}