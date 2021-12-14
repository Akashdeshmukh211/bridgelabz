package LogicalProgram;

public class Fibonacci_Series {

	public static void main(String[] args) {
		   int num1 = 0;
		     int num2 = 1;
		     int temp = 0;
		     int limit = 10;
		     for(int i =2; i<= limit;i++){
		        temp = num1 + num2;
		        System.out.println(temp);
		        num1 = num2; 
		        num2 = temp;
		        }
 
	}

}
