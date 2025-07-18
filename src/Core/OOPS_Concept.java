package Core;

//public:accessible anywhere in any class just need object of class
//private:only inside the class not //outside class for private getter setter method //can't access outside class with object also//for any varaiable and method only inside the class
//protected :inisde and outside the class //outisde -only object need
class B {
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int m = 3;
	private static int new1=30;
   public static int new2=500;
   protected static int new3=500;
	public int getB() {
		return b;
	}

	protected void inside_Class() {
		System.out.println("public inside class:" + a);
		System.out.println("private inside class:" + b);
		System.out.println("protected inside class:" + c);
		System.out.println("static inside the class:"+new1);
	}

	public static int getNew1() {
		return new1;
	}
}

public class OOPS_Concept {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println("a:" + obj.a);// anywhere just need object of that class
//		System.out.println("b:"+obj.b); can access only inside the 
		System.out.println("using getter private :" + obj.getB());
		System.out.println("protected outside class:" + obj.c);
		System.out.println("private static outside the class:"+obj.getNew1());
		System.out.println("public static outside class:"+B.new2);
		System.out.println("protected static outside the clas:"+B.new3);
		obj.inside_Class();
	}

}
