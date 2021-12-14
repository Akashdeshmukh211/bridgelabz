package functionalProgram;
import java.util.*;
public class WindChill {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature of wind...");
		double temperature=scanner.nextDouble();
		System.out.println ("Enter the velocity of wind...");
		double velocity=scanner.nextDouble();
		scanner.close();
		
		double value = wind(temperature, velocity);
		System.out.print("Wind Chill = " + value);

	}
	static double wind(double temperature, double velocity) {
		double windchill = 35.74 + 0.6215 * temperature + (0.4275 - 35.75) * Math.pow(velocity, 0.16);
		return windchill;
	}

}
