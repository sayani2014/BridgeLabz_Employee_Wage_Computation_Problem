package EmployeeWageComputationService;

import EmployeeWageComputationModel.EmployeeWageProperties;

import java.util.ArrayList;
import java.util.Scanner;

public class WageCalculation implements WageCalculationInterface{
    public static final int ABSENT = 0;
    public static final int FULLTIME = 1;
    public static final int PARTTIME = 2;

    Scanner input = new Scanner(System.in);
    ArrayList<EmployeeWageProperties> propertiesArrayList = new ArrayList<>();
    private int totalEmployeeWage;

    @Override
    public ArrayList<EmployeeWageProperties> addWageDetails() {
        EmployeeWageProperties properties = new EmployeeWageProperties();

        System.out.print("Enter the company name: ");
        properties.setCompany(input.next());

        System.out.print("Enter the Employee Rate Per Hour: ");
        properties.setEmpRatePerHour(input.nextInt());

        System.out.print("Enter the Total Number of Working Hours: ");
        properties.setMaxHoursPerMonth(input.nextInt());

        System.out.print("Enter the Total Number of Working days: ");
        properties.setNumOfWorkingDays(input.nextInt());

        propertiesArrayList.add(properties);

        return propertiesArrayList;
    }

    @Override
    public void display(ArrayList<EmployeeWageProperties> propertiesArrayList) {
        for(int i = 0; i<propertiesArrayList.size(); i++) {
            System.out.println("Company Name: " + propertiesArrayList.get(i).getCompany());
            System.out.println("Employee Rate Per Hour: " + propertiesArrayList.get(i).getEmpRatePerHour());
            System.out.println("Total number of Working Days Per Month: " + propertiesArrayList.get(i).getNumOfWorkingDays());
            System.out.println("Total number of Working Hours Per Month: " + propertiesArrayList.get(i).getMaxHoursPerMonth());
            System.out.println();
        }
    }

    @Override
    public void dailyEmployeeWage(ArrayList<EmployeeWageProperties> propertiesArrayList) {
        int empHour = 0, totalWorkingHours = 0;
        long dailyEmpWage = 0;

        System.out.print("Enter the company name you want to calculate the Daily wage: ");
        String companyName = input.next();

        for(int i = 0; i < propertiesArrayList.size(); i++) {
            if(propertiesArrayList.get(i).getCompany().equalsIgnoreCase(companyName)) {
                for(int j = 1; j <= propertiesArrayList.get(i).getNumOfWorkingDays(); j++) {
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
                    dailyEmpWage = empHour * propertiesArrayList.get(i).getEmpRatePerHour();
                    System.out.println("Daily Employee Wage is " + dailyEmpWage + "\n");
                    totalWorkingHours += empHour;
                    if(totalWorkingHours >= propertiesArrayList.get(i).getMaxHoursPerMonth())
                        break;
                }
            }
            else
                System.out.println("No such company name found!");
            int totalEmpWage = (propertiesArrayList.get(i).getEmpRatePerHour() * totalWorkingHours);
            System.out.println("Wages per month of the employee working in " + companyName + " is : Rs." + totalEmpWage);
        }
    }
}
