package functionalProgram;
import java.util.*;
public class Quadratic {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first input value");
		int a=scanner.nextInt();
		System.out.println("Enter second input value");
		int b=scanner.nextInt();
		System.out.println("Enter third input value");
		int c=scanner.nextInt();
		scanner.close();
	
		double value =root(a,b,c);
		System.out.print(value);
	}
	static double root(int a, int b, int c) {
		double root1, root2;
		double delta = ((b * b) - (4 * a * c));

		if (delta > 0) {
			System.out.println("Roots are real and unequal");
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			root2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("First root is:" + root1);
			System.out.println("Second root is:" + root2);
		}

		else if (delta == 0) {
			System.out.println("Roots are real and equal");
			root1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Root:" + root1);
		} else {
			System.out.println("Roots are ");
		}
		return delta;
	}
}