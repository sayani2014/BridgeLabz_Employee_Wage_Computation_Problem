package EmployeeWageComputationService;

import EmployeeWageComputationModel.EmployeeWageProperties;

import java.util.ArrayList;

public interface WageCalculationInterface {
    abstract ArrayList<EmployeeWageProperties> addWageDetails();
    abstract void display(ArrayList<EmployeeWageProperties> propertiesArrayList);
    abstract void dailyEmployeeWage(ArrayList<EmployeeWageProperties> propertiesArrayList);
}
