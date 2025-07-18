package Core;

//polymorphism:-one object having different form
//method overloading:-based on number of argument//based on type of argument//.based on sequence of argument//within same class //same name//main method also overload bcz jvm always call main method which has string args
//method overriding:-
public class Polymorphism {
	int a = 20;
	char b = 'C';

	public void show(int a) {
		System.out.println("a is :" + a);
		System.out.println("this pointing to current object:" + this.a);
	}

	public void show(char b) {
		System.out.println("b is:" + b);
		System.out.println("this pointing to current object:" + this.b);
	}

	public void show(int a, int b) {
		System.out.println(" a and b is:" + a + " " + b);
	}

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.show(23);
		obj.show('A');
		obj.show(0, 0);
		obj.main(40, 40);
		obj.ob(obj);
	}

	public static void main(int a, int b) { // overload main method
		System.out.println("a and b is :" + a + " " + b);
	}

	public void ob(Polymorphism ob1) { /// overload based on object
		System.out.println("a and c:" + ob1.a + " " + ob1.b);
	}
}
