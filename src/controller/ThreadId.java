package controller;

public class ThreadId extends Thread {
	
	

	public ThreadId() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		int tid = (int) getId();
		System.out.println(tid);
	}
	
}
