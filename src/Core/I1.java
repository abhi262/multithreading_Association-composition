package Core;
//abstraction  achieve using:using abstract class//using interface
//interface:interface is same as abstraction but in abstract class we can create the abstract method 
//and normal method both but in case of interface all the method are abstract we can create normal       method inside it
//concrete method:means method having body
//it is used to achieve multiple inheritance
//method :public abstract method inside the interface
//variable:public static final by default
//in java 8 default concrete method is also allowed but with default access modifier
//in java 8 static method with public keyword
//in java9 private method also allowed 
//The main method can be used for execution regardless of whether the containing class is public or not, as long as the method is public.
//one public class in one file so same only one public interface in one file
public interface I1 {
	public static final int a = 0;//variable static and final  also so we cannot assigned
  void show ();
  default void print() {
	  System.out.println("normal method acess with default access modifier");
  }
  private void print2() { //private also allowed
	  System.out.println("private normal methd also allowed "); //BUT NOT create object of i1 bcz interface cannot creat object
  }
}
 interface I2{
	int b=200;
	void show2();
}
class Int implements I1,I2{ //implements keyword used
	int gh=45;
	public void show() {
		System.out.println("iinteface i1 is working");
	}
	public void show2() {
		System.out.println("inteface i2 is working:"+b);//no need of object bcz inherited
	}
	public static void main(String[] args) {
		Int obj=new Int();
		Int obj1=new Int();
		obj.show2();
		obj.show();
		obj.print();//use object after inherited also
		
	}
}
