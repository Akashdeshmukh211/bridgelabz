package LogicalProgram;

import java.util.*;

public class CouponNum {

	public static void main(String[] args) {
		System.out.println("Enter the number of Coupons");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		
		couponNumber(number);
		
	}
	
	static void couponNumber(int number) {
		int[] array = new int[number];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * number);
			
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
			}
		}
		for (int i : array) {
			System.out.println("Generated number is : " + i);
		}
		System.out.println("Distinct generated number are :" + number);
		
	}

}
