/**
 * Compute Employee Wage for multiple companies
 * Note: Each Company has its own wage, number of working days and working hours per month
 * Use Class Method with function parameters instead of Class Variables
 *
 * @author: SAYANI KOLEY
 * @since: 15/06/2021
 */

class WageCalculation {
    public static final int ABSENT = 0;
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;

    public int calculateWorkinghours(int no_of_days, int hours_in_month) {
        int empHour = 0;
        int totalWorkingHours = 0;
        for(int i=1;i<=no_of_days;i++) {
            int empCheck = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (empCheck) {
                case ABSENT:
                    empHour = 0;
                    break;
                case FULLTIME:
                    empHour = 8;
                    break;
                case PARTTIME:
                    empHour = 4;
                    break;
            }
            totalWorkingHours += empHour;
            if(totalWorkingHours >= hours_in_month)
                break;
        }
        //System.out.println(totalWorkingHours);
        return totalWorkingHours;
    }
    public void totalEmpWage(String companyName, int totalWorkingHours,  int empWagePerHour) {
        int totalEmpWage = (empWagePerHour * totalWorkingHours);
        System.out.println("Wages per month of the employee working in " + companyName + " is : Rs." +totalEmpWage);
    }
}

public class EmployeeWageComputation {
    public static void main(String args[]) {
        //Create object for DMart
        WageCalculation wageCalculateDMart = new WageCalculation();
        //Calculation of total working hours of the employee working in DMart
        int calculatedTotalWorkingHoursDMart = wageCalculateDMart.calculateWorkinghours(20,  100);
        //Calculation of the total wages of the employee working in DMart
        wageCalculateDMart.totalEmpWage("DMart", calculatedTotalWorkingHoursDMart, 30);

        //Create object for Reliance Retails
        WageCalculation wageCalculateReliance = new WageCalculation();
        //Calculation of total working hours of the employee working in Reliance Retails
        int calculatedTotalWorkingHoursReliance = wageCalculateDMart.calculateWorkinghours(30,  150);
        //Calculation of the total wages of the employee working in Reliance Retails
        wageCalculateDMart.totalEmpWage("Reliance Retails", calculatedTotalWorkingHoursReliance, 20);
    }
}

