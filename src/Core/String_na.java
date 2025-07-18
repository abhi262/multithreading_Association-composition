package Core;

public class String_na {
  
   public static void main(String[] args) {
	   String s1="abhijeet";
	   String s2="abhijeet";
	   String o1=new String("abhijeet");
	   String o2=new String("abhijeet");
	  String_na ob1=new String_na();
//	  System.out.println(s1.toUpperCase());
	  String s=s1.toUpperCase();//return new object after changing 
	  System.out.println(s1);//again same after change 
	  System.out.println(s);
   System.out.println((s1==s2));	  
   System.out.println((o1==o2));	  
   String o3=o1.intern();
   String o4=o1.intern();
   System.out.println((o3==o4));	
   int a[]= {1,2,3};
   int a1[]= {1,2,3};
   int b=10;
//   ob1.disp(s,b);
//   ob1.disp(a, a1);not possible only onw array
  
}
   public void disp(int...  a) {
	   for(int i:a) {
		   System.out.println(i);
	   }
   }
}
