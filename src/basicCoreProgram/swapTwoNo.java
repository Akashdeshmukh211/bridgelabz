package basicCoreProgram;

import java.util.Scanner;
public class swapTwoNo {

	public static void main(String[] args) {
		Scanner swapnum = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter frist Number:-");
	    int number_a = swapnum.nextInt();  // Read user input 1 
	    System.out.println("Enter Second Number:-");
	    int number_b = swapnum.nextInt();  // Read user input 2
	    
	    number_b = number_b + number_a;// swap number without third variable
	    number_a = number_b -number_a;
	    number_b = number_b - number_a;
	    System.out.println("Number frist -" + number_a);
	    System.out.println("Number Second -" + number_b);
	    

	}

}
