package loops;

import java.util.Scanner;

public class Flag_loop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.println("Enter a letter between a and d, or type \"Exit\"");
			String inputted = input.nextLine();
			switch (inputted) {
			case "a":
				System.out.println("apple");
				break;
			case "b":
				System.out.println("banana");
				break;
			case "c":
				System.out.println("cat");
				break;
			case "d":
				System.out.println("doppleganger");
				break;
			case "Exit":
				running = false;
				break;
			default:
				System.out.println("aight");
			}
		}
		input.close();

	}

}
