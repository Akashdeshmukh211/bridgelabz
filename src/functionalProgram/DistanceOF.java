package functionalProgram;
import java.util.*;
public class DistanceOF {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter initial point x:");
		int x=scanner.nextInt();
		
		System.out.println("Enter initial point y:");
		int y=scanner.nextInt();
	
		findDistance(x, y);
		scanner.close();
	}
	static void findDistance(int x, int y) {
		double distance;
		distance = Math.sqrt((x * x) + (y * y));
		System.out.println("Distance between initial and final points " + distance);
		
	}
}
