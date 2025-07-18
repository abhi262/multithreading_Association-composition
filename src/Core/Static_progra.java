package Core;
//we can create more than static block in programm ad its execution based on top to bottom 
//static block is also used to initlize static varibale
import java.util.Scanner;
public class Static_progra {
	static int c;
	int m;
 public static int id=20;
 String name;
 Scanner sc=new Scanner(System.in);
 void getdata() {
	 System.out.println("enter name");
	 name=sc.nextLine();
 }
 public static void show() {
	 
 }
 static {
	 System.out.println("call when class loaded in memory and class loaded in memory when");
	 //class loaded in memory when main method call no  without any object creation
 }
 public void disp() {
	 System.out.println("id is:"+id);
	 System.out.println("name is :"+name);
 }
 static {
	 System.out.println("2nd  sttaic block");
	 c=20;
//	 m=30; only static variable initlize inside it static block
 }
 public static void main(String[] args) {
	 Static_progra ob1=new Static_progra();
	 Static_progra ob2=new Static_progra();
	 Static_progra ob3=new Static_progra();
	 ob1.getdata();
	 ob2.getdata();
	 ob3.getdata();
	 ob1.disp();
	 ob2.disp();
	 ob3.disp();
}
 static {
	 System.out.println("third static block ");
 }
}
