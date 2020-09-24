import java.util.*;

public class EmpWageUC2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		final int RatePerHr=20; int EmpHr=0; int DailyWage;
		boolean EmpVal=ran.nextBoolean();			//Using random bool value
		
		if(EmpVal) {
			System.out.println("Employee Present.");
			EmpHr=8;
		}else {
			System.out.println("Employee Absent.");
		}
		
		DailyWage=EmpHr*RatePerHr;
		System.out.println("Employee daily wage is "+DailyWage);
	}

}