package Thread_Data;

import java.util.ArrayList;
import java.util.List;

public class Database1 implements Runnable{
	
	Object[] st2=new Object[4]; //call instance variable
	int m=20;
  @Override
      
	public void run() {
	  List<String> ob1=new ArrayList<String>();
     List<String> ob2=new ArrayList<String>();
     Object[] st1=new Object[4];
     

     String s1[]=new String[4];
     ob1.add("abhijeet");
     ob1.add("raj");
     ob1.add(null);
	ob1.add("abhijeet");
	System.out.println("DATABASE1 RUN FIRST");
	  System.out.println("thread-name:"+Thread.currentThread().getName());
	  System.out.println("thread-priority db1:"+Thread.currentThread().getPriority());
  st1=ob1.toArray();
// System.out.println(st1[0]);
 for(int i=0;i<st1.length;i++) {
	 st2[i]=st1[i];
 }
 for(Object s11:st2) {
	 System.out.println(s11);
 }
	}
   
}
