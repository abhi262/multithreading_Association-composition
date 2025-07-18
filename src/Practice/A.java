package Practice;
public class A {
  public static void main(String[] args) throws InterruptedException {
//	  Resource r1=new Resource();//1 resource 2 thread
//	  Resource 	r2=new Resource();
	A2 obj=new A2();
	A2 obj1=new A2();
	obj1.start();
	obj.start();
	obj.setName("thread-0");
	obj1.setName("thread-1");
	System.out.println("after main");
	obj.join();
	obj1.join();
    System.out.println("main thread");
	
}

}
