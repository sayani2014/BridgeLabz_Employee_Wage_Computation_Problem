import java.util.*;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empWagePerHour = 20;
		int workingDaysPerMonth = 20;
		int fullDayHour = 8;
		int parttimeDayHour = 4;
		int empWage;
		int amount = 0;
		int no_of_days = 20;
		for(int i=1;i<=no_of_days;i++) {
			int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;
			switch(empCheck){
				case 0:
          break;
				case 1:
          empWage = empWagePerHour * fullDayHour;
					amount = amount + empWage;
					break;
				case 2:
          empWage = empWagePerHour * parttimeDayHour;
					amount = amount + empWage;
					break;
				default:
					System.out.println("Computation Failed! Please check for details!");
					break;
			}
		}
		System.out.println("Wages per month of the employee is : Rs."+amount);
	}
}
