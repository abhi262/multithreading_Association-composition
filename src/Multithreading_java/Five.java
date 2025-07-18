package Multithreading_java;

public class Five extends Thread {
	@Override
	public void run() {
////	super.run();
//	System.out.println("five");
		String s1 = Thread.currentThread().getName();
//	System.out.println(s1);
		if (s1.equalsIgnoreCase("thread-1")) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			thread1(s1);
		} 
		else if (s1.equalsIgnoreCase("thread-2")) 
		{
			thread2(s1);
		} 
		else if (s1.equalsIgnoreCase("thread-3"))
		{
			thread3(s1);
		}
	}

	private void thread3(String s1) {
		System.out.println("thread3 method wil run with thread-3:"+s1);

	}

	private void thread2(String s1) {
		System.out.println("thread2 method will run with thread2:"+s1);

	}

	private void thread1(String s1) {
		System.out.println("thread1 method run with thread 1:"+s1);
	}

}
