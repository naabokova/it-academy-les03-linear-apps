package by.it_academy.less03.main;

public class LinearApps02_10 {

	public static void main(String[] args) {
		
		// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы
		//вписанной и описанной окружностей.
		
		double a = 3;
		double S, r, h, R;
		
		h = a * Math.sqrt(3) / 2;
		S = Math.pow(a, 2) * Math.sqrt(3) / 4;
		r = a * Math.sqrt(3) / 6;
		R = a / Math.sqrt(3);
		
		System.out.println("h = " + h + "\nS = " + S + "\nr = " + r + "\nR = " + R);

	}

}
