import java.util.Random;

public class EmpWageUC11 implements IComputeWage {
	
	public static final int FullTime=1;				//Declaring Global Variables
	public static final int PartTime=2;
	
	private int NoOfComp;						//variables are not kept static
	private CompanyEmpWage [] CompList = new CompanyEmpWage[5];
	
//	public void CompArrayBuilder() {
//		CompList = new CompanyEmpWage[5];
//	}
	
	public void AddArray(String compName,int ratePerHr,	//Adding Comp Details in Array
			int maxWorkingDays,	int maxWorkingHr ) {
		CompList[NoOfComp] = new CompanyEmpWage(compName,ratePerHr,
				maxWorkingDays,maxWorkingHr);
		NoOfComp++;
	}
	
	public void CalculateMonthlyWage() {
		for (int i=0;i<NoOfComp;i++) {
			System.out.println(CompList[i]);
			System.out.println();
			CompList[i].setMonthlyWage(this.CalculateMonthlyWage(CompList[i]));
		}
	}
	
	public int CalculateMonthlyWage(CompanyEmpWage CompObj) {
		
		Random ran = new Random();
		int EmpHr=0; int DailyWage;
		int DaysWorked=0; int HrsWorked=0;
		System.out.println("~~~"+CompObj.CompName+"~~~");
		
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
			DailyWage=EmpHr*CompObj.RatePerHr;
			CompObj.MonthlyWage=DailyWage+CompObj.MonthlyWage;
			System.out.println("Total Working Hours: "+HrsWorked);
			System.out.println("Employee daily wage is "+DailyWage);
		} while(DaysWorked<=CompObj.MaxWorkingDays &&
				HrsWorked<=CompObj.MaxWorkingHr);
		System.out.println();
		System.out.println("Employee monthly wage is "+CompObj.MonthlyWage);
		System.out.println();
		System.out.println("------------------------------------------------------");
		return CompObj.MonthlyWage;
	}
	
	public static void main(String[] args) {
		//creating object companies
		EmpWageUC11 BuilderObject = new EmpWageUC11();
		BuilderObject.AddArray("DG Global",20,20,100);
		BuilderObject.AddArray("Mahindra & Mahindra",10,14,200);
		BuilderObject.AddArray("Google Inc.",50,12,80);
		
		//running method
		BuilderObject.CalculateMonthlyWage();
	}
}