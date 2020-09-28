import java.util.*;

public class EmpWageUC14 implements IComputeWage {
	
	public static final int FullTime=1;				//Declaring Global Variables
	public static final int PartTime=2;
	
	private int NoOfComp=0;						//variables are not kept static
	private ArrayList<CompanyEmpWage> CompList = new ArrayList<CompanyEmpWage>();
	private Map<String,CompanyEmpWage> CompWageMap=new HashMap<String,CompanyEmpWage>(); 
	//HashMap to use company-wage as K-V pair
	
//	public void CompArrayBuilder() {
//		CompList = ArrayList<CompanyEmpWage>();
//	}
	
	public void AddArray(String compName,int ratePerHr,	//Adding Comp Details in Array
			int maxWorkingDays,	int maxWorkingHr ) {
		CompanyEmpWage CompObj = new CompanyEmpWage(compName,ratePerHr,
				maxWorkingDays,maxWorkingHr);
		CompList.add(CompObj);
		CompWageMap.put(compName, CompObj);
	}
	
	public void CalculateMonthlyWage() {
		for (CompanyEmpWage CompObj:CompList) {
			System.out.println(CompObj);
			System.out.println();
			CompObj.setMonthlyWage(this.CalculateMonthlyWage(CompObj));
		}
	}
	
	public int getMonthlyWage(String CompName) {
		return CompWageMap.get(CompName).MonthlyWage;
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
			CompObj.setDailyWage(DailyWage);
		} while(DaysWorked<=CompObj.MaxWorkingDays &&
				HrsWorked<=CompObj.MaxWorkingHr);
		
		System.out.println();
		System.out.print("The daily wage of the month is ");
		CompObj.getDailyWage();
		System.out.println();
		System.out.println("Employee monthly wage is "+CompObj.MonthlyWage);
		System.out.println();
		System.out.println("------------------------------------------------------");
		return CompObj.MonthlyWage;
	}
	
	public static void main(String[] args) {
		//creating object companies
		EmpWageUC14 BuilderObject = new EmpWageUC14();
		BuilderObject.AddArray("DG Global",20,20,100);
		BuilderObject.AddArray("Mahindra & Mahindra",10,14,200);
		BuilderObject.AddArray("Google Inc.",50,12,80);
		
		//running method
		BuilderObject.CalculateMonthlyWage();
		
		//Getting wages from map
		System.out.println("Total wage for DG Global is: "+
				BuilderObject.getMonthlyWage("DG Global"));
		System.out.println("Total wage for Mahindra & Mahindra is: "+
				BuilderObject.getMonthlyWage("Mahindra & Mahindra"));
		System.out.println("Total wage for Google Inc. is: "+
				BuilderObject.getMonthlyWage("Google Inc."));
	}
}