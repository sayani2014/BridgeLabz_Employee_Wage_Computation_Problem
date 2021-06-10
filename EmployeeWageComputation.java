/* Calculate Daily Employee Wage
 * Working Hour = 8
 * Wage Per Hour = 20
 *
 * @author: SAYANI KOLEY
 * DATE: 10/06/2021
 */

public class EmployeeWageComputation {
        public static void main(String args[]) {
            int empWagePerHour = 20;
            int empHour = 0;
            int empPresent = 1;
            int empCheck = (int)(Math.floor(Math.random() * 10)) % 2;
            if (empCheck == empPresent) {
                System.out.println("Employee is present");
                empHour = 8;
            }
            else {
                System.out.println("Employee is absent");
                empHour = 0;
            }
            wageCalculation(empWagePerHour, empHour);
        }
        private static void wageCalculation(int empWagePerHour, int empHour) {
            int empDailyWage = (empWagePerHour * empHour);
            System.out.println("Daily wage of the employee is: Rs."+empDailyWage);
        }
    }


