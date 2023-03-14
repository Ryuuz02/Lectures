package switch_cases;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		String age = input.nextLine();
		switch (age) {
			case "21":
				System.out.println("Adult");
				break;
			case "65":
			case "66":
				System.out.println("Senior");
				break;
			default:
				System.out.println("Child");
				
		}
		input.close();
//		!!!
//		You cannot use switch statements to compare values easily, use if else statements instead
//		!!!
	}

}
