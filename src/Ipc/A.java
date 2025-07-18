package Ipc;

//java lang package already imported in each java programm 
public class A extends Thread {
	
	String[] str = { "abhije", "ba", "Ca", "abhije", "ba", "Ca", "abhije", "ba", "Ca", "abhije", "ba", "Ca" };
	boolean messagesent = false;// bydefault also false
//	Lock Object (lock): We introduced a static final Object lock which is used as a common synchronization lock for both threads. This ensures that the threads do not execute their send_message() or read_message() methods concurrently.
	static final Object lock = new Object();

	@Override
	public void run() {
		String s1 = currentThread().getName();
		if (s1.equals("t1")) {
			try {
				send_message();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				read_message();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
///Send message
	 synchronized void  send_message() throws InterruptedException {
		while (messagesent == true) {
				wait();
			}
//		Thread.sleep(10000);
			for (String s1 : str) {		
				System.out.println(" send" + currentThread().getName() + ":" + s1);
			}
		messagesent = true;
		notify();// the notify method :wake up the another thread of A class which is in sleep
					// mode
	}
	///Read message
	synchronized void read_message() throws InterruptedException {
		while (messagesent == false) {
			wait();	
		}
		for (String s1 : str) {
			System.out.println("read" + currentThread().getName() + ":" + s1);
		}
		 messagesent=false;
		notify();
     
	}
}
