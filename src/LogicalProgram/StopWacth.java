package LogicalProgram;

import java.util.*;

public class StopWacth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press 1 to Start the time:");
		scanner.nextLong();
		long startTime = System.currentTimeMillis();
		System.out.println("Start time.." + startTime);

		System.out.println("Press 2 to stop the time:");
		scanner.nextLong();
		long stopTime = System.currentTimeMillis();
		System.out.println("Stop Time." + stopTime);

		long elapsedTime = stopTime - startTime;
		
		System.out.println("Elapsed time: " + (elapsedTime / 1000) % 60 + "sec");

	}

}
