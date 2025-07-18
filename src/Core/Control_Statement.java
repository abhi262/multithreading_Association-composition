package Core;

public class Control_Statement {

	public static void main(String[] args) {
		Control obj=new Control();
	boolean result=	obj.conditional();
	System.out.println("condition meets?:"+result);
	obj.conditional1();
	obj.nested();
	obj.looping_statement();
	obj.swap_number();
	}

}
class Control{
	 public int a=10,b=20,c=200;
	 public boolean conditional() {
		 if(a>b) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 public void conditional1() {
		 if(a>b) {
			 System.out.println("a is greater");
		 }
		 else if(a>c){
			System.out.println("a is greater"); 
		 }
		 else if(b>c) {
			 System.out.println("b is greater");
		 }
		 else {
			 System.out.println("c is greater");
		 }
	 }
	 public void nested() {
		 int a=7,b=5,c=4;
		 if(a>b) {
			 if(a>c) {
				 System.out.println("a is greater");
			 }
		 }
		 else if(b>c) {
			 System.out.println("b is greater");
		 }
		 else {
			 System.out.println("c is greater");
		 }
	 }
	 public void looping_statement() {
		 //for ,while(){},do {}while()
		 //jump statement:break
		 int a=1,b=1;
		 while(a!=11) {
			 System.out.println("print :"+a);
			 a++;
			 if(a==7) {
				 break; //when equal to 7 its break
			 }
		 }
		 do {
			 System.out.println("print value:"+b);
			 b++;
		 }
		 while(b!=10);
	 }
	 public void swap_number() {
		 int a=10 ,b=20,c;
          c=a;
           a=b;
           b=c;
          System.out.println("a and b:"+a+" "+b);
	 }
	 
}