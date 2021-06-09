public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empWagePerHour = 20;
		int fullDayHour = 8;
		int parttimeDayHour = 4;
		int empPresentFullDay = 1;
		int empAbsent = 0;
		int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;
		if (empCheck == empPresentFullDay) {
			System.out.println("Employee is present for full time");
			int empDailyWageFulltime = (empWagePerHour * fullDayHour);
			System.out.println("Daily wage of the employee working full time is: Rs."+empDailyWageFulltime);
		}
		else if (empCheck == empAbsent) {
			System.out.println("Employee is absent");
			System.out.println("Wage of the employee for the day is zero");
		}
		else {
			System.out.println("Employee is present for part time");
			int empDailyWageParttime = (empWagePerHour * parttimeDayHour);
			System.out.println("Daily wage of the employee working part time is: Rs."+empDailyWageParttime);
		}
	}
}

