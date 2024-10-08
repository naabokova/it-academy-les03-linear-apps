package by.it_academy.less03.main;

public class LinearApps02_02 {

	public static void main(String[] args) {
		
		// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов
		
		double P, S;
		double a = 1;
		double b = 2;
		
		S = (a * b) / 2;
		P = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("Периметр: Р = " + P + "\nПлощадь: S = " + S);
		
		

	}

}
