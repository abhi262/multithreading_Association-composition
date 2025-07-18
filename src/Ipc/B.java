package Ipc;

public class B {

	public static void main(String[] args) throws InterruptedException {
	A obj=new A();
	A obj1=new A();
	obj.setName("t1");
	obj1.setName("t2");
	
	obj.start();
	//here we throw declaration so main method call by jvm and jvm handle this throw 
		//inetrrupted exception in that some standard library where exception handle.
		 obj.join();  // Wait for obj to finish sending messages that'swhy using join the 
//		 main use of join to stop the current thread until complete t1 execution
	obj1.start();
	}

}
