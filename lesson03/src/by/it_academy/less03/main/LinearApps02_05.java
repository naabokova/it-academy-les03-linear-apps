package by.it_academy.less03.main;

public class LinearApps02_05 {

	public static void main(String[] args) {
		
		//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
		
		double R = 2;
		double L, S;
		
		S = Math.PI * Math.pow(R, 2);
		L = 2 * Math.PI *  Math.pow(R, 2);
		
		System.out.println("Длина: L = " + L + "\nПлощадь: S = " + S);

	}

}
