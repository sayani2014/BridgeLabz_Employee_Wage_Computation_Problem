/**
 * Ability to save the Total Wage for Each Company 
 * Use Instance Variable instead of function parameters
 *
 * @author: SAYANI KOLEY
 * @since: 17/06/2021
 */

public class EmployeeWageComputation {
    public static void main(String args[]) {
        //Create object for DMart
        WageCalculation wageCalculateDMart = new WageCalculation("DMart",20,20,100);
        //Calculation of total working hours of the employee working in DMart
        int calculatedTotalWorkingHoursDMart = wageCalculateDMart.calculateWorkinghours();
        //Calculation of the total wages of the employee working in DMart
        wageCalculateDMart.totalEmpWage(calculatedTotalWorkingHoursDMart);

        //Create object for Reliance Retails
        WageCalculation wageCalculateReliance = new WageCalculation("Reliance", 10, 40, 200);
        //Calculation of total working hours of the employee working in Reliance Retails
        int calculatedTotalWorkingHoursReliance = wageCalculateReliance.calculateWorkinghours();
        //Calculation of the total wages of the employee working in Reliance Retails
        wageCalculateReliance.totalEmpWage(calculatedTotalWorkingHoursReliance);
    }
}

