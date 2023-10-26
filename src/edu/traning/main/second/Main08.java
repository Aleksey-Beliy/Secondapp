package edu.traning.main.second;

public class Main08 {

	public static void main(String[] args) {

		double a = 3;
		double b = 4;
		double c = 5;
		double temp;
		double rezult;

		temp = Math.sqrt(Math.pow(b, 2) + 4 * a * c);
		rezult = ((b + temp) / (2 *a) - Math.pow(a, 3) * c + Math.pow(b, -2));
		System.out.println("Значение = " + rezult);
	}

}
