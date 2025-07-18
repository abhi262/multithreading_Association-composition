package Core;
//static keyword:all the object pointing to the same memory location
//static variable is class level variable we can access through class//directly
//variable(class level//no local variable):cannot be used as local variable 
//method:inside the stataic methid we need to create aobject to access non-static variable 
//and method:static method call using the class//directly and object also
//if call static(method variable of same class) inside no need of anythig call directly
//this super cannot be used with static
//block:static block executes automatically when class loaded in memory//static block without main method also when we are usinh java version 1.6 and before 1.6
//inner class(no outer class):
public class Stat {
	public static int a=100;
	public static String name="abhijeet";
	int b=300;
  public static void show() {
	  System.out.println("the value of a is :"+a);
	  Stat ob1=new Stat();
	  ob1.disp();
	  System.out.println("the value of a is :"+ob1.b);//non-staic variable access inside static 
//	  variable need object of that class
  }
 public static void main(String[] args) {
	Stat obj=new Stat();
	obj.show();
	obj.a=500;
	  System.out.println("the value of a is :"+a);
//	  System.out.println("static variable cann access directly:"+name);//directly
	  System.out.println("static variable cann access using class:"+Stat.name);//using clss
	  Stat.show();//call using class//object if//calling static inisde static no object directly also
}
 public void disp() {
//	 static int b=20;//static cannot be declareed as local variable
	 System.out.println("static keyword cannot be used for local variable");
 }
}
