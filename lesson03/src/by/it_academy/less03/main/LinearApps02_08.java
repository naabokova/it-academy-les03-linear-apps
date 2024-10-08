package by.it_academy.less03.main;

public class LinearApps02_08 {

	public static void main(String[] args) {
		
		// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел
		
		double n1 = 2;
		double n2 = 1;
		double x1, x2;
		
		x1 = (Math.pow(n1, 3) + Math.pow(n2, 3)) / 2;
		x2 = Math.sqrt(n1 * n2);
		
		System.out.println("Среднее арифметическое кубов: x1 = " + x1 + "\nСреднее геометрическое модулей: x2 = " + x2);

	}

}
