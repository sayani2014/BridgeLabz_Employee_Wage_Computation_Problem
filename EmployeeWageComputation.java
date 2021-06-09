import java.util.*;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empWagePerHour = 20;
		int totalWorkingHours = 100;
		int workingDaysPerMonth = 20;
		int time;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ");
		System.out.println("1. To enter the total working hours completed this month"); 
		System.out.print("      2. To enter the total working days completed this month: ");
		int value = sc.nextInt();
		switch(value)
		{
			case 1:
				System.out.print("Enter the number of hours attended in office this month: ");
				time = sc.nextInt();
				if (time > totalWorkingHours)
					System.out.println("Number of hours cannot exceed 100!");
				else
				{
					System.out.println("You were present for " +time+ " hours this month.");
					int empWage = (empWagePerHour * time);
					System.out.println("Wages per month of the employee working is: Rs."+empWage);
				}
			break;
			case 2:
				System.out.print("Enter the number of days attended in office this month: ");
				time = sc.nextInt();
				if (time > workingDaysPerMonth)
					System.out.println("Number of days cannot exceed 20!");
				else
				{
					System.out.println("You were present for " +time+ " days this month.");
					int empWage = (empWagePerHour * time * 8);
					System.out.println("Wages per month of the employee working is: Rs."+empWage);
				}
			break;
		}
	}
}
