package Thread_Data;

public class Balance {
	 public int balance=500000;
//	 String str="abhi";
	 StringBuffer str=new StringBuffer("abhi");//string buffer is synchronized(means thread safe)
	 //s
	 int id=0;
	 int count=0;
	 void get() {
		 System.out.println("remainig balance:"+balance);
	 }
	 void disp() 
	    {
//		 this.str=str+"a";
		 this.str=str.append('a');//append is now synchronized bcz string buffer is synhronized so only thread can access 
		 //other thread stop until t1 completes one resource can be used by one thread at a time
		 //append and stringbuffer is already synchronized so no need to synchronize method
		 synchronized (this) {//object locking happen in synchronized block
//			 this means t1 thread enter into balance class and control comes here here t1 block the current class object using this balance class object block by t1 until it completes execution next time t2 block balance class obj when t1 complte bcz resource present in this class
			 id++;//then it is used by only one resource 
		}
		 
		
	 }
	 void get1() {
//	  for(char c:str.tocharArray) {
//		  if(c=='a') {
//			  count++;
//		  }
//	  }
//		 for(int i=0;i<200000;i++) {
//			 if(str.charAt(i)=='a') {
//				 count++;
//			 }
		 
//		 }
		 for(char c:str.toString().toCharArray())
		 {
			 if(c=='a') {
				 count++;
			 }
		 }
	  System.out.println("count:"+count);
	 }
}
