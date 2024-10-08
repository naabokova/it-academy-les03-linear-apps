package by.it_academy.less03.main;

public class LinearApps10 {

	public static void main(String[] args) {
		
		//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба
		
		double a = 2;
		double S1 = a * a;
		double S2 = S1 * 6;
		double V = Math.pow(a, 3);
			
		System.out.println("Площадь грани: S1 = " + S1 +  "\nПлощадь полной поверхности: S2 = " + S2 + "\nОбъем куба: V = " + V);
		

	}

}
