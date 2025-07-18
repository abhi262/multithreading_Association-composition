package Lock;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Resource r1=new Resource();
	Resource r2=new Resource();
	Functionality ob1=new Functionality(r1);
	Functionality ob2=new Functionality(r2);
	ob1.setName("t1");
	ob2.setName("t2");
	ob1.start();
	ob2.start();
	ob1.join();
	ob2.join();
	System.out.println("main thread:");
	r1.disp(Thread.currentThread().getName());
}
}
