package Runnable_interface;

public class Seven implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("serven"+name);
		System.out.println("serven"+name);
		System.out.println("serven"+name);
		System.out.println("serven"+name);
		System.out.println("serven"+name);
		System.out.println("serven"+name);

	}

}
