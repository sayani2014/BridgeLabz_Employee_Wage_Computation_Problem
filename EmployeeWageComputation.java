/* Check whether the employee is present or absent
 *
 * @author: SAYANI KOLEY
 * DATE: 10/06/2021
 */

public class EmployeeWageComputation {
	public static void main(String args[]) {
		int empPresent = 1;
		int empCheck = (int)(Math.floor(Math.random() * 10)) % 2;
		if (empCheck == empPresent)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
