import java.util.Random;

public class EmpWageUC3 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int FullTime=1; int PartTime=2;
		final int RatePerHr=20; int EmpHr=0; int DailyWage;
		int EmpVal=ran.nextInt(3);			// Creating random int ranging 0 to 2
		
		if(EmpVal == FullTime) {
			System.out.println("Employee Present.");
			EmpHr=8;
		}
		else if(EmpVal == PartTime) {
			System.out.println("Employee Present but working Part Time");
			EmpHr=8;
		}else {
			System.out.println("Employee Absent.");
		}
		
		DailyWage=EmpHr*RatePerHr;
		System.out.println("Employee daily wage is "+DailyWage);
	}

}