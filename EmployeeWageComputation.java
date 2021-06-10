/* Calculate Daily Employee Wage using Switch Case
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
            int empCheck = (int)(Math.floor(Math.random() * 10)) % 3;
            switch(empCheck)
            {
                case 0:
                    System.out.println("Employee is absent today");
                    empHour = 0;
                    break;
                case 1:
                    System.out.println("Employee is present for full time today");
                    empHour = 8;
                    break;
                case 2:
                    System.out.println("Employee is present for part time today");
                    empHour = 4;
                    break;
            }
            wageCalculation(empWagePerHour, empHour);
        }
        private static void wageCalculation(int empWagePerHour, int empHour) {
            int empDailyWage = (empWagePerHour * empHour);
            System.out.println("Daily wage of the employee is: Rs."+empDailyWage);
        }
}

