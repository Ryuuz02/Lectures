package arrays;

import java.io.*;
import java.util.Scanner;

public class Employee_calc {

	public static void main(String[] args) throws FileNotFoundException {
		String[] names = new String[5];
		double[] pay = new double[5];
		int count = 0;
		File employees = new File("src/arrays/Employee_earnings.csv");
		Scanner file = new Scanner(employees);
		while (file.hasNextLine()) {
			String line = file.nextLine();
			String[] values = line.split(".");
			names[count] = values[0];
			pay[count] = Double.parseDouble(values[1]);
		}
		file.close();
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i] + " - " + pay[i]);
		}
	}

}
