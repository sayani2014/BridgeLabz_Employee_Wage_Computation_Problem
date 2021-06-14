/* Calculate Wages till a condition of total working hours or days is reached for a month applying the OOPs Concept
 * Total working Hours = 100
 * Working Hour Full Time = 8
 * Working Hour Part Time = 4
 * Wage Per Hour = 20
 * Number of Days = 20
 *
 * @author: SAYANI KOLEY
 * @since: 14/06/2021
 */

public class EmployeeWageComputation {
    public static final int absent = 0;
    public static final int fullTime = 1;
    public static final int partTime = 2;
    public static final int no_of_days = 20;
    public static final int empWagePerHour = 20;
    public static final int hours_in_month = 100;

    public static void main(String args[]) {
        //Calculation of total working hours of the employee
        int calculatedTotalWorkingHours = calculateWorkinghours();

        //Calculation of the total wages of the employee
        int totalEmpWage = totalEmpWage(calculatedTotalWorkingHours);

        //Print the total wage
        System.out.println("Wages per month of the employee is : Rs." +totalEmpWage);
    }
    private static int calculateWorkinghours() {
        int empHour = 0;
        int totalWorkingHours = 0;
        for(int i=1;i<=no_of_days;i++) {
            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (empCheck) {
                case absent:
                    empHour = 0;
                    break;
                case fullTime:
                    empHour = 8;
                    break;
                case partTime:
                    empHour = 4;
                    break;
            }
            totalWorkingHours += empHour;
            if(totalWorkingHours >= hours_in_month)
                break;
        }
        return totalWorkingHours;
    }
    private static int totalEmpWage(int totalWorkingHours) {
        int totalEmpWage = (empWagePerHour * totalWorkingHours);
        return totalEmpWage;
    }
}

