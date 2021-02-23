public class EmpWageBuilderUC5
{
	public static final int IS_PART_TIME=1;
   public static final int IS_FULL_TIME=2;
   public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=2;		

	public static void main(String [] args)
	{
		//variables
		int empHrs=0,empWage=0,totEmpWage=0;
		//computation
		for(int day=0; day < NUM_OF_WORKING_DAYS; day++)
		{

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
			empWage=empHrs * EMP_RATE_PER_HOUR;
			totEmpWage += empWage;
			System.out.println("Employee Wage : " +empWage);
		}
		 System.out.println("Total Employee Wage : " +totEmpWage);
	}

}
