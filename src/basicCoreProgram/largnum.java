package basicCoreProgram;

public class largnum {

	public static void main(String[] args) {
		int number_1 = 1;
		int number_2 = 8;
		int number_3 = 1;
	
		if(number_1 > number_2 && number_1 > number_3 ) {
				System.out.println("First number is Largets " + number_1);
		}else if (number_2 > number_1 && number_2 > number_3) {
			System.out.println("second number is largets " + number_2);
		}else if (number_3 > number_1 && number_3 > number_2) {
			System.out.println("third number is largets " + number_3);
		}else {
			System.out.println("All number are equal");
		}
		

	}

}
