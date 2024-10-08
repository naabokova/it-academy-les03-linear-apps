package by.it_academy.less03.main;

public class LinearApps08 {

	public static void main(String[] args) {
		
		//Написать программу, которая выводит на экран первые четыре степени числа π
		
	double count = 1;
	double x;
	
	x = Math.pow(Math.PI, count);
	System.out.println("x1 = " + x);
	
	count++;
	x = Math.pow(Math.PI, count);
	System.out.println("x2 = " + x);
	
	count++;
	x = Math.pow(Math.PI, count);
	System.out.println("x3 = " + x);
	
	count++;
	x = Math.pow(Math.PI, count);
	System.out.println("x4 = " + x);

	}

}
