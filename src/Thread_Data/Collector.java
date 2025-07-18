package Thread_Data;
//database 1 database 2 run at a same time
//join:join method is used to stop the current thread and thread is create to run the two application parllely
//->so here main method is current thread bcz i want to stop the main method bcz this d1 d2 thread i want to run parllely
//it is mainly used to stop main thread and if create thread then my motive is to run parllely so mainly i used if i want to stop main thrad
public class Collector {
public static void main(String[] args) throws InterruptedException {
	Database1 ob=new Database1();
	Database2 ob1=new Database2();
	 Thread t1=new Thread(ob); //t1 and t2 is real thread object
	 Thread t2=new Thread(ob1);
//	 t2.setPriority(10);
//	 t2.setPriority(10);
	 t2.setPriority(Thread.MAX_PRIORITY);
	 t1.setPriority(Thread.MIN_PRIORITY);
	 t1.start();
	 t2.start();
//	 System.out.println("thread t1 priority:"+t1.getPriority());
//	 System.out.println("thread t2 priority:"+t2.getPriority());
	 t1.join();
	 t2.join();//for runable interface
	 t1.setName("database-1");
	 t2.setName("database-2");
	 Process(ob1.s3,ob.st2);
	 System.out.println("ddfd");
}
private static void Process(Object[] s3, Object[] st4) {
System.out.println("inside the data process");
for(Object s1:s3) {
	System.out.println("db2-data:"+s1);
}
for(Object s2:st4) {
	System.out.println("db1-data:"+s2);
}
	
}
     
}
