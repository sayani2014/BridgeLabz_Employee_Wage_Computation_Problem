public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empWagePerHour = 20;
		int fullDayHour = 8;
		int parttimeDayHour = 4;
		int empDailyWageFulltime = (empWagePerHour * fullDayHour);
		System.out.println("Daily wage of the employee working full time is: Rs."+empDailyWageFulltime);
		int empDailyWageParttime = (empWagePerHour * parttimeDayHour);
		System.out.println("Daily wage of the employee working part time is: Rs."+empDailyWageParttime);
	}
}
