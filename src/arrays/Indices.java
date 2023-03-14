package arrays;

import java.util.Scanner;

public class Indices {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter some text:\n");
		int[] counts = new int[26];
		String text = input.nextLine().toLowerCase();
		for (int i=0; i <text.length(); i++) {
			char c = text.charAt(i);
			if (c >= 'a' || c <= 'z') {
				counts[c - 'a'] = counts[c - 'a'] + 1;
			}
		}
		
		for (int i=0; i<counts.length; i++) {
			if (counts[i] > 0) {
				System.out.println((char)(i + 'a') + ": " + counts[i]);
			}
		}
		input.close();
	}
}
