package by.it_academy.less03.main;

public class LinearApps06 {

	public static void main(String[] args) {
		
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения)
		
		double b = 1;
		double a = 1;
		double c = 1;
		double x;
		
		x = ( (b + Math.pow(b * b + 4 * a * c, 0.5) / (2 * a) ) - Math.pow(a,3) * c + Math.pow(b, -2));
		
		System.out.println("x = " + x);
	}

}
