package Practice;

public class A2 extends Thread{
//	Resource rs1;
//	public A2(Resource rs1){
//		this.rs1=rs1;
//	}
//private static final Object lock = new Object(); // Common lock for synchronization here we create the common lock for both thread so only can use the resource at a time
//when we use this
 @Override
public void run() {
	 String str=currentThread().getName();
	 String str1="abhijeet";
//	 System.out.println(rs1);
	disp(str1);
//	 synchronized (Resource.class) {
//		 rs1.disp();
//	}
	
	
}
//synchronized(this):every time new object will enter with thread(this two object A2 obj=new A2();)
//	A2 obj1=new A2();) and they lock one object so another will access and use the resource
void disp(String str1) {
	System.out.println(this);
	synchronized (this) {
	
//		System.out.println("object adress value:"+this+" "+Thread.currentThread().getName());
		for(int i=0;i<=50;i++) {
			System.out.println(""+str1+" "+currentThread().getName());
		}	
	}
	
	
}


}
