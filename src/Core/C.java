package Core;
//constructor:private(not able to create the object in differnt class)
//shortcut:right click source
 class MyConstructor {
   int a=10,b=20;
   protected MyConstructor() {
	   System.out.println("a is :"+a+" b is :"+b);
   }
//   public static void main(String[] args) {
//	   Constructor obj=new Constructor();
//   }
}
class Modification {
	static int a;
	public Modification(int b) {
		a=b;
		System.out.println("the value of A is :"+a);
	}
	
}
public class C{
	int a,b;
	public C() {
		System.out.println("default constructor of class C");
	}
	public C(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public static void main(String [] args) {
		MyConstructor obj=new MyConstructor();
		System.out.println("line 2");
		C ob4=new C();
		C obj1=new C(3,4);
		System.out.println(" a nd b is:"+obj1.a+" "+obj1.b);
		Modification ob2=new Modification(20);
	}
}