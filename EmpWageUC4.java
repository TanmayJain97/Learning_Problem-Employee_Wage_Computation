import java.util.Random;

public class EmpWageUC4 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		final int FullTime=1; final int PartTime=2;
		final int RatePerHr=20; int EmpHr=0; int DailyWage;
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
		}

		DailyWage=EmpHr*RatePerHr;
		System.out.println("Employee daily wage is "+DailyWage);
	}

}