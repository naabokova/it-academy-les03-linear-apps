package by.it_academy.less03.main;

public class LinearApps02_04 {

	public static void main(String[] args) {
		
		// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти его периметр и площадь.
		
		double x1 = 1;
		double x2 = 2;
		double x3 = 3;
		double y1 = 4;
		double y2 = 5;
		double y3 = 6;
		double L1, L2, L3, P, S;
		
		L1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		L2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		L3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		
		P = L1 + L2 + L3;
		S = Math.sqrt((P - L3) * (P - L2) * (P - L1));
		
		System.out.println("Периметр: P = " + P + "\nПлощадь: S = " + S);

	}

}
