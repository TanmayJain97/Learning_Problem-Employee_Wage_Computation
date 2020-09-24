import java.util.Random;

public class EmpWageUC5 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		final int FullTime=1; final int PartTime=2;
		final int RatePerHr=20; int EmpHr=0; int DailyWage; int MonthlyWage=0;
		final int WorkingDays=20;
		
		for(int day=1;day<=WorkingDays;day++) { //Starting loop for 20 day cycle
		
			int EmpVal=ran.nextInt(3);			// Creating random int ranging 0 to 2
			
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
	
			DailyWage=EmpHr*RatePerHr;
			MonthlyWage=DailyWage+MonthlyWage;
			System.out.println("Employee daily wage is "+DailyWage);
		}
		System.out.println();
		System.out.println("Employee monthly wage is "+MonthlyWage);
		
	}
}