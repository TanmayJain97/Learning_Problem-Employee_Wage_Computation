
public interface IComputeWage {
	public void AddArray(String company, int empRatePerHour, int noOfWorkingDays, int maxHoursInMonth);
	public void CalculateMonthlyWage();
	public int CalculateMonthlyWage(CompanyEmpWage CompObj);
}