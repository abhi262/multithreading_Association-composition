package Core;

//overrriding:same name and same argument//different class//but inherited class//means in case of overriding signature will also same but in differnt class(inherited class)
//in overrriding if variable name and method name  is same in both base class and derived so if i using the derived class object so call derived clss function and variable give prefence to object of that class //if i m using the base class object so call base class variable and function
//argument:same name//same type of argument//same no of argument//same sequence of argument in bothclass
//Overriding:if covariant return type(means parent class return is child or subtype of child class return type
//access modifier :means child class access modifer must be greater than parents class access modifier//bydefault the access modifier of function is package private so if i give public in parents
//public>protected>private>default(i,e package private)
//private method//final method //static method cannot overriden
class Parents {
	int a = 10, b = 20;
	String name = "abhijeet";

	protected Object disp() { // based on covariant return type overrirde the method(overriden)
		System.out.println("child class");
		System.out.println("a and b  is :" + a + " " + b);
		return null;
	}
}

public class Runtime_polymorphism extends Parents {
	static int a = 100;
	int b = 30;

	public String disp() {//overriding method
		super.disp();//using super keyword we ivoke the parent class overidden method
		System.out.println("derived class");
		System.out.println("static a :" + a);
		System.out.println("name is :" + name);
		System.out.println("b :" + b);
		System.out.println("a :" + a);
		return null;
	}

	public static void main(String[] args) {
		Runtime_polymorphism ob1 = new Runtime_polymorphism();
		Parents ob2 = new Parents();
		ob1.disp();// using derived class object call derived class function
//		ob2.disp();// using base class object call base class function

	}

}
