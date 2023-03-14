package switch_cases;
import java.util.Scanner;
public class Yes_No {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("yes or no?");
		String choice = input.nextLine();
		switch (choice) {
			case "y": case "Y": case "yes": case "Yes":
				System.out.println("Yes");
				break;
			default:
				System.out.println("No");
		}
		input.close();
	}

}