package Core;
//typecasting:smalller datatype into larger datatype and larger datatype into smaller datatype 
class A1{
	public void show() {
		System.out.println("A class");
	}
}
class B1 extends A1{
	public void show2() {
		System.out.println("b class printed");
	}
}
public class Typecasting {
	int a=20;
	double m=20.30;
public static void main(String[] args) {
	Typecasting  obj=new Typecasting ();
	byte c;
	float d;
	c=(byte) obj.a;
	d=(float) obj.m;
	System.out.println(c);
	System.out.println("cast to float :"+d);
	//means object created of B but give refrence to A(object of b created but it assigned to address of A)
	//new B1 means object created A1 ob1(means refrence created)
	A1 ob1=new B1();
	ob1.show();
//	ob1.show2(); can't access bcz it is refrence of A1
	B1 ob2 =(B1) ob1; //here refrence of b1 created and and a refrence of A1 assigned after casting into b1 is called upcasting
//	and refrence also choose to class that is inherit not give refrence to any class 
//	which is not inherited and had no connection
	ob2.show2();
}
}
