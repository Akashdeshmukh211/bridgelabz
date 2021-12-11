package basicCoreProgram;

import java.util.Scanner;

public class QandR {

	public static void main(String[] args) {
		Scanner QandR = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Dividend Value:-");
	    int dividend = QandR.nextInt();  // Read user input 1 
	    System.out.println("Enter Divisor Value:-");
	    int divisor = QandR.nextInt();  // Read user input 2
	    if(dividend < divisor) {
	    	System.out.println("Dividend cant be greater then divisor");
	    }else {
	    	 int quotient = dividend / divisor;
	         int remainder = dividend % divisor;
	 	    System.out.println("The Quotient is = " + quotient);
	 	    System.out.println("The Remainder is = " + remainder);
	    	
	    }
	}
}
