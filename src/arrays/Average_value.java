package arrays;

public class Average_value {

	public static void main(String[] args) {
		double[] values = {1.0, 2.0, 3.0, 4.0};
		double total = 0.0;
		for (int i = 0; i < values.length; i++) {
			total += values[i];
		}
		System.out.println("Average is " + (total/values.length));
	}

}
