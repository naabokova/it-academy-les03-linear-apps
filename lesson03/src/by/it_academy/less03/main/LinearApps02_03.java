package by.it_academy.less03.main;

public class LinearApps02_03 {

	public static void main(String[] args) {
		
		//Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)
		
		double x1 = 1;
		double x2 = 2;
		double y1 = 3;
		double y2 = 4;
		double L;
		
		L = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("L = " + L);

	}

}
