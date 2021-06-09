import java.util.*;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empPresent = 1;
		int empWagePerHour = 20;
		int workingDaysPerMonth = 20;
		Scanner sc = new Scanner(System.in);
		int empCheck = (int)(Math.floor(Math.random() * 10)) % 2;
		switch(empCheck)
		{
			case 0:
				System.out.println("Employee is absent today");
				System.out.println("The wage of the employee cannot be calculated since the employee is absent!");
				break;
			case 1:
				System.out.println("Employee is present today");
				System.out.print("Enter 8 for Fulltime presence or 4 for Parttime presence: ");
				int time = sc.nextInt();
				switch(time)
				{
					case 4:
						System.out.println("You were present for " +time+ " hours today.");
						int empDailyWagePartTime = (empWagePerHour * time * workingDaysPerMonth);
						System.out.println("Wages per month of the employee working parttime is: Rs."+empDailyWagePartTime);
						break;
					case 8:
						System.out.println("You were present for " +time+ " hours today.");
						int empDailyWageFullTime = (empWagePerHour * time * workingDaysPerMonth);
						System.out.println("Wages per month of the employee working fulltime is: Rs."+empDailyWageFullTime);
						break;
					default:
						System.out.println("Wrong input! Employee Wage cannot be calculated!");
						break;
				}
				break;
		}
	}
}
