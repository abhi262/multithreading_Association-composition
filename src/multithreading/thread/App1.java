package multithreading.thread;
//in this case two/three n no of  application will run at same time like in laptop at same time 
//we can watch video an in background  we can downloading 

//one more scenerio:-single class/single resource access by two people like youtube ,paytm QR
public class App1 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			disp();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void disp() throws InterruptedException {
	
		System.out.println("this will run first app1");
		Thread.sleep(20000);
		System.out.println("this will run first app1");
		System.out.println("this will run first app1");
		System.out.println("this will run first app1");
		System.out.println("this will run first app1");


	}
}
