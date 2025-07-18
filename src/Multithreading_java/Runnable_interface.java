package Multithreading_java;

public class Runnable_interface implements Runnable,Thread_interface{

	
	public void run() {
	String str=Thread.currentThread().getName();
//	int id=(int) Thread.currentThread().getId();
//	System.out.println(id);
	if(str.equalsIgnoreCase("thread abhi")) {
//		System.out.println(Thread.currentThread().getId());
		thread1(str);
		
	}
	else if(str.equalsIgnoreCase("thread abhijeet")) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(Thread.currentThread().getId());
		disp(str);
	}
	else if(str.equalsIgnoreCase("thread raj"))
	{
//		System.out.println(Thread.currentThread().getId());
		thread3(str);
	}
	}

	private void thread3(String str) {
		int id=(int) Thread.currentThread().getId();
		System.out.println("thread 3:"+str+" id is:"+id);
	}

	private void thread1(String str) {
		int id=(int) Thread.currentThread().getId();
		System.out.println("thread 1 method:"+str+" id is:"+id);
		Thread_interface.disp1();
		
	}

	@Override
	public void disp(String str) {
		int id=(int) Thread.currentThread().getId();
   		System.out.println("run interface method:"+str+" id is:"+id);
	}

}
