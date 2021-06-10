/* Calculate Daily Employee Wage
 * Working Hour Full Time = 8
 * Working Hour Part Time = 4
 * Wage Per Hour = 20
 *
 * @author: SAYANI KOLEY
 * DATE: 10/06/2021
 */

public class EmployeeWageComputation {
        public static void main(String args[]) {
            int empWagePerHour = 20;
            int empHour = 0;
            int empPresentFullDay = 1;
            int empAbsent = 0;
            int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;
            if (empCheck == empPresentFullDay) {
                System.out.println("Employee is present for full time");
                empHour = 8;
            }
            else if (empCheck == empAbsent) {
                System.out.println("Employee is absent");
                empHour = 0;
            }
            else {
                System.out.println("Employee is present for part time");
                empHour = 4;
            }
            wageCalculation(empWagePerHour, empHour);
        }
        private static void wageCalculation(int empWagePerHour, int empHour) {
            int empDailyWage = (empWagePerHour * empHour);
            System.out.println("Daily wage of the employee is: Rs."+empDailyWage);
        }
    }

