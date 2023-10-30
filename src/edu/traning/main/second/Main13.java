package edu.traning.main.second;

public class Main13 {

	public static void main(String[] args) {

		double x1 = 15;
		double x2 = 9;
		double x3 = 8;
		double y1 = 2;
		double y2 = 3;
		double y3 = 4;
		double lenght1;
		double lenght2;
		double lenght3;

		double P;
		double p;
		double S;

		lenght1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		lenght2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		lenght3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		p = (lenght1 + lenght2 + lenght3) / 2;
		S = Math.sqrt(p * (p - lenght1) * (p - lenght2) * (p - lenght3));
		P = lenght1 + lenght2 + lenght3;
		System.out.println("P = " + P);
		System.out.println("S = " + S);
	}

}
