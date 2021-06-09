import java.util.*;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empPresent = 1;
		int empWagePerHour = 20;
		Scanner sc = new Scanner(System.in);
		int empCheck = (int)(Math.floor(Math.random() * 10)) % 2;
		switch(empCheck)
		{
			case 0:
				System.out.println("Employee is absent today");
				System.out.println("The daily wage of the employee cannot be calculated since the employee is absent!");
				break;
			case 1:
				System.out.println("Employee is present today");
				System.out.print("Enter 8 for Fulltime presence or 4 for Parttime presence: ");
				int time = sc.nextInt();
				System.out.println("You were present for " +time+ " hours today.");
				switch(time)
				{
					case 4:
						int empDailyWagePartTime = (empWagePerHour * time);
						System.out.println("Daily wage of the employee working parttime is: Rs."+empDailyWagePartTime);
						break;
					case 8:
						int empDailyWageFullTime = (empWagePerHour * time);
						System.out.println("Daily wage of the employee working fulltime is: Rs."+empDailyWageFullTime);
						break;
					default:
						System.out.println("Wrong input! Employee Wage cannot be calculated!");
						break;
				}
				break;
		}
	}
}
