package by.it_academy.less03.main;

public class LinearApps04 {

	public static void main(String[] args) {
		
		// В n малых бидонах 80 л молока. Сколько литров молока в m больших
		//бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
		
		int m = 1;    // л б.б.
		int n = 1;    // л м.б.
		int a;        // мал. б.
		int b;        // б.б
		int x;        // л мол.в б.б.
		
		a = 80 / n;
		b = a + 12;
		x = b * m;
		
		System.out.println(x + " литров молока в больших бидонах");
		
		

	}

}
