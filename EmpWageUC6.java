import java.util.Random;

public class EmpWageUC6 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		final int FullTime=1; final int PartTime=2;
		final int RatePerHr=20; int EmpHr=0; int DailyWage; int MonthlyWage=0;
		final int MaxWorkingDays=20;
		final int MaxWorkingHr=100;
		int DaysWorked=0; int HrsWorked=0;
		
		do { //Starting loop till condition fulfilled
		
			int EmpVal=ran.nextInt(3);			// Creating random int ranging 0 to 2
			DaysWorked++;
			
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
			System.out.println("Day: "+DaysWorked);
			System.out.println("Total Working Hours: "+HrsWorked);
			System.out.println("Employee daily wage is "+DailyWage);
		} while(DaysWorked<=MaxWorkingDays && HrsWorked<=MaxWorkingHr);
		System.out.println();
		System.out.println("Employee monthly wage is "+MonthlyWage);
		
	}
}