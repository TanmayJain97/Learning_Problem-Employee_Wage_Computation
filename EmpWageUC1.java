import java.util.*;

public class EmpWageUC1 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		boolean EmpVal=ran.nextBoolean();			//Using random bool value
		
		if(EmpVal) {
			System.out.println("Employee Present.");
		}else {
			System.out.println("Employee Absent.");
		}
	}

}