package Multithreading_java;

public class Multi {
  
      public static void main(String[] args) throws InterruptedException {
//       Five ob1=new Five(); //thread create and initlize
////       Seven ob2=new Seven();
//       ob1.setName("five-thread");
//       ob1.start();
//       ob2.setName("seven-thread");
//       ob2.start();//thread start
//       ob1.start();//thread start
//       System.out.println(Thread.currentThread().getName());
        //one class multiple thread
//    	  Five t1=new Five();//thread-0 bcz create first
//    	  Five t2=new Five();
//    	  Five t3=new Five();
//          t1.setName("thread-1");  
//          t2.setName("thread-2");  
//          t3.setName("thread-3");  
//          t1.start();
////          Thread.sleep(3000);
//          t2.start();
//          t3.start();
    	  Runnable_interface ob1=new Runnable_interface();
    	  Runnable_interface ob2=new Runnable_interface();
    	  Runnable_interface ob3=new Runnable_interface();
    	  System.out.println(Thread.currentThread().getId());
    	  System.out.println(Thread.currentThread().getName());
//    	  ob2.start();  not directly in case of runnable interface convert the object into
//    	  thread
    	  Thread t1=new Thread(ob1);
    	  Thread t2=new Thread(ob2);
    	  Thread t3=new Thread(ob3);
    	  t1.setName("thread abhi");//id-15
    	  t2.setName("thread abhijeet");//id-16
    	  t3.setName("thread raj");//id-17
    	  t1.start();
    	  t2.start();
    	  t3.start();
    	  
	}
      
}
