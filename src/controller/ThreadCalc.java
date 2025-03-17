package controller;

public class ThreadCalc extends Thread {

	private int a;
	private int b;
	private int operacao;
	
	public ThreadCalc(int a, int b, int operacao) {
		this.a = a;
		this.b = b;
		this.operacao = operacao;
	}
	
	@Override
	public void run() {
		calc();
	}
	


	private void calc() {
		int res = 0;
		String op = "";
		
		try {
			sleep(operacao*1000);
		}catch(Exception e){
			System.err.print(e);
		}
		
		switch (operacao) {
		case 0: {
			res = a + b;
			op = "+";
			break;
		}
		case 1: {
			res = a - b;
			op = "-";
			break;
		}
		case 2: {
			res = a * b;
			op = "*";
			break;
		}
		case 3: {
			res = a / b;
			op = "/";
			break;
		}
		default:
			System.out.println("vish");
		}
		int tid = (int) getId();
		System.out.println("#" + tid + " ==> " + a + " " + op + " " + b + " = " + res);
		
	}

}
