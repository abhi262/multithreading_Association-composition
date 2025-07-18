package Thread_Data;

public class Account {
//	public int balance=500000;
  public static void main(String[] args) throws InterruptedException {
	  Balance b1=new Balance();//object create always in main method bcz execution starts from main so only one time creates and try to passs using constructor and declare instance to store bcz in run method everytime create b1 object
	  Database1 d1=new Database1();
	  Thread t1=new Thread(d1);
//	  t1.setName("d1 thread);
	  Crd ob=new Crd(b1,d1);
	  Crd ob1=new Crd(b1,d1);
	  ob.setName("person1");
	  ob1.setName("person2");
	  ob1.start();
	  ob.start();
	  ob.join();
	  ob1.join();//stop main thread so stop main thread method get() until t1 t2 completes
		 System.out.println(b1.balance);

	  b1.get();
	  b1.get1();
	  
	  System.out.println("stop the main thread until t1,t2 completed");
}
}
