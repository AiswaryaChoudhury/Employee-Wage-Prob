public class EmpWageBuilderUC6
{
	public static final int IS_PART_TIME=1;
   public static final int IS_FULL_TIME=2;
   public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;
	public static void main(String [] args)
	{
		//variables
		int empHrs=0,empWage=0,totEmpWage=0, totEmpHrs=0,totWorkingDays=0;
		//computation
		while ( totEmpHrs<= MAX_HRS_IN_MONTH &&
				totWorkingDays < NUM_OF_WORKING_DAYS)
 		{
			totWorkingDays++;
			double empCheck=Math.floor(Math.random() * 10) % 2;
			switch((int)empCheck)
			{
				case IS_PART_TIME:
						empHrs=4;
						break;
				case IS_FULL_TIME:
						empHrs=8;
						break;
				default :
						empHrs=0;
			}
			totEmpHrs +=empHrs;
			System.out.println("Day# : " +totWorkingDays + "Employee hours: " 
										+ empHrs);
		}
		totEmpWage = totEmpHrs * EMP_RATE_PER_HOUR;
		 System.out.println("Total Employee Wage : " +totEmpWage);
	}

}
