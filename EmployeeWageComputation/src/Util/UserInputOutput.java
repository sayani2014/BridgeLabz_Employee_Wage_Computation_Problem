package Util;

import java.util.Scanner;

public class UserInputOutput {
    public static int userMenu() {
        Scanner input = new Scanner(System.in);
        int option;
        System.out.println();
        System.out.println("1. Add Employee Details");
        System.out.println("2. Display Employee Details");
        System.out.println("3. Calculate Employee Wage");
        System.out.println("4. Quit");

        option = input.nextInt();

        return option;
    }
}
