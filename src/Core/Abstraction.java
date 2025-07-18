package Core;
 //abstract method:the method which is declared but cannot define it( will define in  the sub class)
//if any abstract method in the class so it is neccessary to make class as abstract
//but if any abstract class so it is not mandatory to create the abstract method inside it
//cannot create the object of abstract class
//java doesn't support multiple inheritance
//if abstarct method  we not override in child class then compile time error comes
abstract class Abs{
	public abstract  void add();//abastract method declared here
	public abstract void abs();
	public void display() {
		System.out.println("normal method inside the abstract class");
	}
}
 abstract class Abs2{
	public abstract void abs2();
}
 class DispAbs2 extends Abs2{
	public void abs2() {
		System.out.println("display abs2 class abstarct method ");
	}
 }
public class Abstraction extends Abs {
  public void add() {  //abstarct method define here
	  System.out.println("abstract method define in subclass");
  }
	
	public static void main(String[] args) {
		Abstraction obj=new Abstraction();
		obj.add();
		obj.display();
		obj.abs();
//    Abs obj=new Abs();
		DispAbs2 ob1=new DispAbs2();
		ob1.abs2();
	}

	@Override
	public void abs() {
		System.out.println("second abstract method ");
		
	}

}
