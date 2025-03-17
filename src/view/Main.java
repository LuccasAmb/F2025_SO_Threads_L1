package view;

import controller.ThreadCalc;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;
		//int op = 2;
		
		for(int op = 0; op < 100; op++) {
			int opera = op%4;
			ThreadCalc t = new ThreadCalc(a, b, opera);
			t.start();
		}
		
	}

}
