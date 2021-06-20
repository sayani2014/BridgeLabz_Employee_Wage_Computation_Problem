package EmployeeWageComputationcontroller;

import EmployeeWageComputationModel.EmployeeWageProperties;
import EmployeeWageComputationService.WageCalculation;
import Util.UserInputOutput;
import java.util.ArrayList;


public class EmployeeWageComputation {
    public static void main(String args[]) {
        ArrayList<EmployeeWageProperties> propertiesArrayList = new ArrayList<>();
        WageCalculation wageCalculation = new WageCalculation();
        boolean flag = true;

        while (flag) {
            int option = UserInputOutput.userMenu();

            switch(option) {
                case 1:
                    System.out.println("\n" + "Enter Wage Computation Details" + "\n");
                    propertiesArrayList = wageCalculation.addWageDetails();
                    flag = true;
                    break;
                case 2:
                    System.out.println("\n" + "Display Employee Wage Computation Details" + "\n");
                    wageCalculation.display(propertiesArrayList);
                    break;
                case 3:
                    System.out.println("\n" + "Calculate and Display Employee Wage" + "\n");
                    wageCalculation.dailyEmployeeWage(propertiesArrayList);
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }
}

