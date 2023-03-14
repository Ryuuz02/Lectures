package arrays;

import java.util.Scanner;

public class Complex_average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] values = new int[5];
		for (int i = 0; i <values.length; i++) {
			System.out.println("Please enter your integer (" + (i + 1) + "/" + values.length + ")");
			values[i] = input.nextInt();
		}
		int max = values[0];
		for (int i = 1; i <values.length; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		}
		System.out.println("The maximum value in your array is " + max);
		input.close();
	}

}
