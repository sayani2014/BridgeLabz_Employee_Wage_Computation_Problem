import java.util.*;
import java.lang.Math.*;

public class LineComparisonComputation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x1: ");
                float x1=sc.nextFloat();
	        System.out.print("Enter the value of y1: ");
	        float y1=sc.nextFloat();
                System.out.print("Enter the value of x2: ");
	        float x2=sc.nextFloat();
 		System.out.print("Enter the value of y2: ");
	        float y2=sc.nextFloat();
	  	    
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
 	 	
		System.out.println("The 2 points of the line are: (" +x1+ "," +y1+ ") and (" +x2+ "," +y2+ ")");	 	    
  	        System.out.println("Length of the line is: " +distance+ " units.");	
	}
}
