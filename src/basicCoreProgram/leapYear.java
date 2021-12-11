package basicCoreProgram;

public class leapYear {

	public static void main(String[] args) {
		int Yeartocheck = 2012;
		boolean leapCheck = false;
		if(Yeartocheck % 4 == 0 ) {
			
			if(Yeartocheck % 100 == 0) {
				
				if(Yeartocheck % 400 == 0) {
					 leapCheck = true;
				}else {
					 leapCheck = false;
				}
				
			}
			 else {
				 leapCheck = true;
		}

	}else {
		leapCheck  = false;
	}
		if (leapCheck) {
		      System.out.println(Yeartocheck + " is a leap year.");
		}else {
		      System.out.println(Yeartocheck + " is not a leap year.");
		      }
	}
}
