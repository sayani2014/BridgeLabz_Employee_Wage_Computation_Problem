/* Calculate Daily Employee Wage using Switch Case for a complete month
 * Working Hour Full Time = 8
 * Working Hour Part Time = 4
 * Wage Per Hour = 20
 * Number of Days = 20
 *
 * @author: SAYANI KOLEY
 * DATE: 10/06/2021
 */

public class EmployeeWageComputation {
    public static final int absent = 0;
    public static final int fullTime = 1;
    public static final int partTime = 2;
    public static final int no_of_days = 20;
    public static final int empWagePerHour = 20;

    public static void main(String args[]) {
        int empHour = 0;
        int amount = 0;
        for(int i=1;i<=no_of_days;i++) {
            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (empCheck) {
                case absent:
                    System.out.println("Employee is absent today");
                    empHour = 0;
                    break;
                case fullTime:
                    System.out.println("Employee is present for full time today");
                    empHour = 8;
                    break;
                case partTime:
                    System.out.println("Employee is present for part time today");
                    empHour = 4;
                    break;
            }
            int empDailyWage = (empWagePerHour * empHour);
            amount += empDailyWage;
        }
        System.out.println("Wages per month of the employee is : Rs."+amount);
    }
}



