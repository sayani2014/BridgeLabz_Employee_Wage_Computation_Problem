public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empWagePerHour = 20;
		int fullDayHour = 8;
		int empPresent = 1;
		int empCheck = (int)(Math.floor(Math.random() * 10)) % 2;
		if (empCheck == empPresent) {
			System.out.println("Employee is present");
			int empDailyWage = (empWagePerHour * fullDayHour);
			System.out.println("Daily wage of the employee is: Rs."+empDailyWage);
		}
		else {
			System.out.println("Employee is absent");
			System.out.println("Wage of the employee for the day is zero");
		}
	}
}

