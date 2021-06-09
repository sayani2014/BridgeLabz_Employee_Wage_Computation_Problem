import java.util.*;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empWagePerHour = 20;
		int fullDayHour = 8;
		int parttimeDayHour = 4;
		int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;
		switch(empCheck)
		{
			case 0:
				System.out.println("Employee is absent today");
				System.out.println("The daily wage of the employee cannot be calculated since the employee is absent!");
				break;
			case 1:
				System.out.println("Employee is present for full time today");
				int empDailyWageFullTime = (empWagePerHour * fullDayHour);
				System.out.println("Daily wage of the employee working fulltime is: Rs."+empDailyWageFullTime);
				break;
			case 2:
				System.out.println("Employee is present for part time today");
				int empDailyWagePartTime = (empWagePerHour * parttimeDayHour);
				System.out.println("Daily wage of the employee working parttime is: Rs."+empDailyWagePartTime);
				break;
			default:
				System.out.println("Computation Failed! Please check for details!");
				break;
		}
	}
}

		
