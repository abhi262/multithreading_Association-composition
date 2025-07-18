package Core;

public class Exception_java {
   public static void main(String[] args) throws ArithmeticException {
	  int i=2,j=0;
	  int k;
//	try {
//		k = i/j;
//		
//	}
	
//	} catch (Exception e) {
//		
//		e.printStackTrace();
//  System.err.print("exception handled");		
//	}
//	catch(ArithmeticException e) {
////		System.out.println();
//		e.printStackTrace();
//		System.out.println(e);
//		 System.out.println("ddd");
//
//	}
//	finally {
//		System.out.println("finally bye");
//	}
//	
//	
//	int a[]= {1,2,3,4,5};
//	for(int k1=0;k1<=5;k1++) {
//		try {
//			System.out.println(a[k1]);
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("resolved");
//		}
//		System.out.println("done");
//
//		 try {
//			k=i/j;
//		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println(e); not print the stack trace means occurs at which line
//		}
		 
		System.out.println("done1");
		Exception_java ob1=new Exception_java();
		
		ob1.disp();
		System.out.println("done2");
	}

private void disp() {
  int i=4,j=0;
  System.out.println("done3");	
  try {
	int k=i/j;
} catch (Exception e) {
	
	e.printStackTrace();
}
  System.out.println("done4");	
}
	
	
	
	  
	  
	 

}
