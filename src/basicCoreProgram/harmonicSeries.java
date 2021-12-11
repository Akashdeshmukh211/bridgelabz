package basicCoreProgram;

import java.util.*;
public class harmonicSeries {

	public static void main(String[] args) {
		int num_i = 1;
		double rst = 0.0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number for length of series");
		int num = in.nextInt();
		int i = 0;
		while(i<= num)
		{
			System.out.print("1/" + i + " "+ "+");
			rst = rst + (double)1/i;
			i++;
		}
		System.out.println("\n\n Sum of Harmonic Series is " + rst);
	}

}
