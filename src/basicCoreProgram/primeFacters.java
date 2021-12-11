package basicCoreProgram;

import java.util.*;

public class primeFacters {

	public static void main(String[] args) {
		 int number;
	      Scanner pNum = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = pNum.nextInt();
	     
	      for (int i = number; i >= 2; i--) {
	            boolean isPrime = true;
	            for (int j = 2; j < i-1; j++) { //increment "j" not "i"
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) System.out.println(i);
	        }
	   }

	}


