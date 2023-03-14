package if_else;
import java.util.Scanner;
public class Using_Equals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter yes or no");
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
			System.out.print("Yes");
		} else if (choice.equals("n") || choice.equals("no") || choice.equals("N") || choice.equals("NO")){
			System.out.print("No");
		}
		input.close();

	}

}
