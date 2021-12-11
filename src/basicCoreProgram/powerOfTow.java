package basicCoreProgram;
import java.util.Scanner;

public class powerOfTow {

	public static void main(String[] args) {
		boolean leapCheck = false;
		Scanner pvalue = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Value:-");
	    double poweroftow = pvalue.nextDouble();  // Read user input
		int a = 2;
		if(poweroftow <= 31 ) {
			for(int i = 1; i <=poweroftow ; i++) {
				double leapYear = Math.pow(a, i);
				if(leapYear % 4 ==0) {
					
					if(leapYear % 100 == 0) {
						
						if(leapYear % 400 == 0) {
							leapCheck = true;
						}else {
							leapCheck = false;
						}
					}else {
						leapCheck = true;
					}
				}else {
					leapCheck = false;
				}
				if(leapCheck) {
					System.out.println(leapYear + "is the leap year");
				}else {
					System.out.println(leapYear +"is not leap year");
				}
				
			}
		
		}else {
			System.out.println("Ennter Value less then 31");
		}
		

	}

}
