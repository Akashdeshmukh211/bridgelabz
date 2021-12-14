package functionalProgram;

import java.util.*;

public class SumofNum {

	static void findTriplet(int number, int[] array) {
		// System.out.println("hi..");
		boolean found = false;

		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println("Triplets are :" + array[i] + " " + array[j] + " " + array[k]);
						found = true;
					}
				}
			}
		}
		if (found == false)
			System.out.println("Triplets not Exist...");
	}
	public static void main(String agrs[]) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter array size:");
		int number = scanner.nextInt();
		int array[] = new int[number];
		System.out.println("Input array elements:");
		for (int i = 0; i <number; i++) {
			array[i] = scanner .nextInt();
		}
		findTriplet(number, array);
		scanner.close();
	}
}
