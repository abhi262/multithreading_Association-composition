package Runnable_interface;

public class Launch {
	public static void main(String[] args) throws Exception {
//		Five five = new Five();
//		Seven seven = new Seven();
//		Thread thread = new Thread(five);
//		Thread thread1 = new Thread(five);
//		Thread thread2 = new Thread(seven);
//		thread.setName("first thread for class five");
//		thread1.setName("second thread for class five");
//		thread2.setName("first thread for class seven");
//		thread.setPriority(Thread.MIN_PRIORITY);
//		thread1.setPriority(Thread.MAX_PRIORITY);
//		thread.start();
//		thread1.start();
//		thread2.start();

//		thread.join();
//		thread1.join();
//		thread2.join();
//		System.out.println("main thread will run first");
		String_buffer string_builder = new String_buffer();
		
		Syncorinized_block syncorinized_block = new Syncorinized_block(string_builder);
		Syncorinized_block syncorinized_block2 = new Syncorinized_block(string_builder);
		syncorinized_block.setName("thread1");
		syncorinized_block2.setName("thread2");
		syncorinized_block.start();
		syncorinized_block2.start();
	}
}
