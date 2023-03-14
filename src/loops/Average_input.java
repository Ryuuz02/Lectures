package loops;
import java.util.Scanner;
public class Average_input {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a value you wished to be averaged, or \"e\" to exit");
		int total = 0;
		int numbers = 0;
		boolean running = true;
		String inputed = input.nextLine();
		do {
			System.out.println("Please input a value you wished to be averaged, or \"e\" to exit");
			if (inputed == "e") {
					running = false;
					break;
			}
			Double value = Double.parseDouble(inputed);
			numbers++;
			total += value;
		} while (running);
		System.out.println("The average value is " + total / numbers);	
			
		input.close();

	}

}
