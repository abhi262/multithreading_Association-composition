package multithreading.thread;

public class Launch {
	public static void main(String[] args) {
		App1 app1 = new App1();
		App2 app2 = new App2();
		app1.start();
		app2.start();
	}
}
