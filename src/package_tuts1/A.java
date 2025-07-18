package package_tuts1;

import package_tuts.*;//for whole class
import package_tuts.Package;//for particular class
//import package_tuts.Package;

public class A {
	public static void main(String[] args) {
		// this is full qualified way to access
		package_tuts.Package obj = new package_tuts.Package();
		obj.disp();
		System.out.println("b from package class:" + obj.b);// public access
//   System.out.println("private from package :"+obj.name);//private not access
//   Package.main(args); 
		obj.without_main();
//		System.out.println(obj.var); not protected access
		B ob1=new B();
		ob1.show();
	}
}
class B extends Package{
	public void show() {
		Package ob1=new Package();
		//no need to create the object of that class to access the variable bcz its inherited that class
		System.out.println("protected varibale in extend class:"+var);
	}
}
