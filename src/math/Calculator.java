package math;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean running = true;
		double[] prev = new double[2];
		boolean has_prev = false;
		boolean has_prev2 = false;
		do {
			System.out.print("> ");
			String xString = input.next();
			if (!xString.equalsIgnoreCase("exit")) {
				String op = input.next();
				String yString = input.next();
				boolean badInput = false;
				double x = 0;
				if (xString.equals("^") && has_prev) {
					x = prev[0];
				} else if (xString.equals("^")) {
					badInput = true;
				} else if (xString.equals("^^") && has_prev2) {
					x = prev[1];
				} else if (xString.equals("^^")) {
					System.out.println(xString);
					badInput = true;
				} else {
					x = Double.parseDouble(xString);
				}
				double y = 0;
				if (yString.equals("^") && has_prev) {
					y = prev[0];
				} else if (yString.equals("^")) {
					badInput = true;
				} else if (yString.equals("^^") && has_prev2) {
					y = prev[1];
				} else if (yString.equals("^^")) {
					System.out.println(yString);
					badInput = true;
				} else {
					y = Double.parseDouble(yString);
				}
				
				System.out.println("X = " + x);
				System.out.println("Y = " + y);
				System.out.println("Operation: " + op);
				if (badInput) {
					System.out.println("Bad Input");
				} else {
					switch (op) {
						case "+":
							prev[1] = prev[0];
							prev[0] = (x + y);
							if (has_prev = true) {
								has_prev2 = true;
							}
							has_prev = true;
							System.out.println(prev[0]);
							break;
						case "-":
							prev[1] = prev[0];
							prev[0] = (x - y);
							if (has_prev = true) {
								has_prev2 = true;
							}
							has_prev = true;
							System.out.println(prev[0]);
							break;
						case "*":
							prev[1] = prev[0];
							prev[0] = (x * y);
							if (has_prev = true) {
								has_prev2 = true;
							}
							has_prev = true;
							System.out.println(prev[0]);
							break;
						case "/":
							prev[1] = prev[0];
							prev[0] = (x / y);
							if (has_prev = true) {
								has_prev2 = true;
							}
							has_prev = true;
							System.out.println(prev[0]);
							break;
						case "//":
							prev[1] = prev[0];
							prev[0] = (y / x);
							if (has_prev = true) {
								has_prev2 = true;
							}
							has_prev = true;
							System.out.println(prev[0]);
							break;
						default:
							System.out.println("Bad input");
					}
				}
			} else {
				running = false;
			}
		} while (running);
		input.close();
	}
}
 