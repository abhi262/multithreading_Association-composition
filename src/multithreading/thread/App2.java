package multithreading.thread;

public class App2 extends Thread {
	@Override
	public void run() {
		super.run();
		disp2();
	}

	private void disp2() {
		System.out.println("this will run first app2");
		System.out.println("this will run first app2");
		System.out.println("this will run first app2");
		System.out.println("this will run first app2");
		System.out.println("this will run first app2");

		
	}
}
