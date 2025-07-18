package Practice;

public class Resource {
  String s1="eclipse";
  StringBuffer s2=new StringBuffer("stringbuffer");
  void disp() {
	  for(int i=0;i<=20;i++) {
//		  System.out.println(" "+s1+" "+Thread.currentThread().getName());
		  System.out.println(" "+s2+" "+Thread.currentThread().getName());
	  }
  }
}
