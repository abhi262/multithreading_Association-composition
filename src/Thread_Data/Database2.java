package Thread_Data;

import java.util.HashSet;
import java.util.Set;

public class Database2 implements Runnable {
	 Object s3[]=new Object[4]; //call instance variable
	@Override
	public void run() {
		HashSet<String> ob1=new HashSet<String>();
		ob1.add("one");
		ob1.add("one1");
		ob1.add("one2");
		ob1.add("one3");
		System.out.println("DATABASE2 RUN FIRST");
	  System.out.println("size is:"+ob1.size());
	  System.out.println("thread-name:"+Thread.currentThread().getName());
	  System.out.println("thread-priori db2:"+Thread.currentThread().getPriority());
	  Object s2[]=new Object[ob1.size()];
	 

		s2= ob1.toArray();
		for(int i=0;i<ob1.size();i++) {
			s3[i]=s2[i];
		}
		for(Object s4:s3) {
			System.out.println(s4);
		}
	}

}
