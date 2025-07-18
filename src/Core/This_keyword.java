package Core;
//This keyword:refers to current class object means current class instance variable//current class method//current class constructor
//this keyword used to return current class instance(object)
//variable//constructor//method this 3 only uses
public class This_keyword {
	int a=10;
	public This_keyword() {
		this(10);//this keyword is used to call current class constructor
		System.out.println("default constructor");
		
	}
	public This_keyword(int c) {
//		this(); we can also call default constructor
		System.out.println("parameterised constructor");
		
	}
	This_keyword show() {
		System.out.println("return current class object");
		return this;
	}
	public void disp() {
//		show(); current class method here explicitity this is written this.show() but not visible
		int a=20;
		System.out.println(this.a);//pointing current class object(instance variable)
		System.out.println(a);//if not use this print local variable
	}
    public static void main(String [] args) {
    	This_keyword ob=new This_keyword();
    	This_keyword ob1=new This_keyword();
    	ob.disp();
    ob1=ob.show();
    System.out.println(ob1);
    }
}
