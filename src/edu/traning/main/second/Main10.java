package edu.traning.main.second;

public class Main10 {

	public static void main(String[] args) {

		double x = 45;
		double y = 30;
		double temp1, temp2, temp3, temp4;

		temp1 = Math.cos(y) + Math.sin(x);
		temp2 = Math.cos(x) - Math.sin(y);
		temp3 = temp1 / temp2;
		temp4 = temp3*Math.tan(x*y);
		System.out.println(temp4);
	}

}
