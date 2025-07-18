package Core;
//Final:used with variable//class/method
//variable:if i dont want to change the value of variable used final keyword
//class:if use final with class we can't extends or inherit class
//method :if i use final with method so we can't overriden
final class  A{ //cannot extedns class if i put final 
	public final int a=200;
	public final void disp() {
	  System.out.println("overriding method");  
	}
	
}
public class Fina {
//	public void disp() {//cannot override final method
//		System.out.println("overriden method");
//	}
    public static void main(String[] args) {
     Fina obj=new Fina();
//     obj.disp();
//     obj.a=300;//final varaiable is constant can't change the value of final
	}
}
