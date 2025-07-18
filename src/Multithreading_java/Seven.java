package Multithreading_java;

public class Seven extends Thread {
@Override
public void run() {
   try { 
	Thread.sleep(5000);
} catch (InterruptedException e) {

	e.printStackTrace();
}
   String s1=Thread.currentThread().getName();
	System.out.println(s1);
	System.out.println("seven");
//	super.run();
	
}

}
