package Core;
import java.util.Scanner;//using scanner class
public class Getting_user_input {
	int a;
	String b,f;
	long c;
	char ch;
	double d;
	public static void main(String[] args) {
		Getting_user_input obj=new Getting_user_input();
	    Scanner sc=new Scanner(System.in);
//	    sc.nextLine();
	    System.out.println("enter the  a");
	    obj.a=sc.nextInt();
	    System.out.println("integer is "+obj.a);
	    System.out.println("enter the string b");
	     obj.b=sc.next();
	     System.out.println("string is:"+obj.b);
	     System.out.println(" enter the phone number");
	     obj.c=sc.nextLong();
	     System.out.println("phone number is:"+obj.c);
	        sc.nextLine(); // This ensures the next nextLine() will work correctly

//	     System.out.println("enter character");
//	     obj.ch=sc.next().charAt(0);
//	     System.out.println("character:"+obj.ch);
//	     
	     
	     System.out.println("enter full name:");
	     obj.f=sc.nextLine();
	     System.out.println(" full name is :"+obj.f); //it will used to print after space
	     System.out.println("enter decimal:");
       obj.d=sc.nextDouble();
	     System.out.println("double is"+obj.d);
	}

}
