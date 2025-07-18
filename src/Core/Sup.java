package Core;
//super keyword:we know this keyword refer to current class object //but super keyword refers the immediate parents class object
//called immediate parents class constructor using the super keyword 
//variable//constructor//method this 3 only uses
class immediate{
	int a=20;
	public void disp() {
		System.out.println("this is disp ");
	}
	public immediate(int m) {
		System.out.println("parents class constructor");
	}
}
public class Sup extends immediate{
	int a=200;
	public Sup() {
		super(200);//call constructor
		System.out.println("child class constructor");
		
	}
	public void disp() {
		super.disp();//create the immediate parents  class object and call disp function of parents 
//		class
		System.out.println("call the parents instance variable:"+super.a);
		//first create the parents class object using super and call the a we need object to call a
		//but here super is also used to create object
		System.out.println("this is disp1");
	}
	public void disp2() {
		this.disp();//creating current class object and call current class method
		System.out.println("this is disp2");
		System.out.println("access current class a using this:"+this.a);
		//both a in parents and child and we know with child class object  can access both parents
//and child class variable so which one call bcz both having same name a so using this call current
//class and using super call immediate parents class object
	}
   public static void main(String[] args) {
	   Sup obj=new Sup();
	   obj.disp2();
   }
}
