public class EmployeeWageCompute
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Employee Wage Computation problem");
		int present = 1;
		double empCheck = Math.floor(Math.random()*10) % 2;
		if(empCheck == present)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Emloyee is Absent");
		}
	}
}
