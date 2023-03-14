package file_reading;
import java.io.*;
import java.util.Scanner;
public class File_reading {
	public static void main(String[] args) throws IOException {
		File f = new File ("src/file_reading/Values.dat");
		Scanner input = new Scanner(f);
		int counter = 0;
		double total = 0;
		while (input.hasNextLine()) {
			String line = input.nextLine();
			double grade = Double.parseDouble(line);
			counter++;
			total+=grade;
		input.close();
		}
		System.out.println("Average is " + total/counter);
	}
}
