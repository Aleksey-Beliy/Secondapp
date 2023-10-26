package edu.traning.main.second;

public class Main12 {

	public static void main(String[] args) {

		double x1 = 4;
		double y1 = 6;
		double x2 = 5;
		double y2 = 7;
		double rezult1;
		double rezult2;
		double rezult3;

		rezult1 = Math.pow(x2 - x1, 2);
		rezult2 = Math.pow(y2 - y1, 2);
		rezult3 = Math.sqrt(rezult1 + rezult2);
		System.out.println(rezult3);

	}

}
