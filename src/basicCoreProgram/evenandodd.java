package basicCoreProgram;
import java.util.Scanner;
public class evenandodd {

	public static void main(String[] args) {
		Scanner evenodd = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter frist Number:-");
	    int number = evenodd.nextInt();  // Read user input number
	    System.out.println(number);
	    if(number % 2 == 0) {
	    	System.out.println("Number is Even " + number);
	    }else {
	    	System.out.println("Number is odd " + number);
	    }

	}

}
