package input;
import java.util.Scanner;
public class Input_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		if (age >= 65) {
			System.out.println("You can most certainly drink");
		} else if (age >= 21) {
			System.out.println("You can drink");
		} else {
			System.out.println("You cannot drink");
		}
		
		input.close();
	}
}
