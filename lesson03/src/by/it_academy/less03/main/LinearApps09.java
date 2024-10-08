package by.it_academy.less03.main;

public class LinearApps09 {

	public static void main(String[] args) {
		
		//Найти произведение цифр заданного четырехзначного числа
		
		int n = 1234;
		
		int x, x1, x2, x3, x4;
		
		x1 = n % 10;
		x2 = n % 100 / 10;
		x3 = n % 1000 / 100;
		x4 = n % 10000 / 1000;
		
		x = x1 * x2 * x3 * x4;
		
		System.out.println("x = " + x );

	}

}
