package package_tuts;
//1)package:is like a folder used to group related classes like we put all song in one folder
//2)package is used to avoid name conflict suppose we have two class with same name so we 
//put into differnt package
//3)package present in the lib folder inside src.zip of jdk 
//import java.util.Scanner;import only scanner class
import java.util.*;//import all class of util
//import java.Core.Sup;

public class Package {
	public int a;
	public int b=3000;
  private String name="abhijeet";
  protected int var =5000;
//       Scanner sc=new Scanner(System.in);create the object of scanner class which is present  in util to access the variable and method of scanner class in package tuts classed
//  public static void main(String[] args) {
//	  Package obj=new Package();
//	java.util.Scanner sc =new java.util.Scanner(System.in);//here direct create the object of scanner class and use method of scanner class in this class
//	obj.a=sc.nextInt();
//	System.out.println(obj.a);
//	System.out.println("main method");
//}
  public void disp() {
	  System.out.println("from package_tuts");
  }
  public void without_main() {
	  System.out.println("without main programm aceess in differnt package");
  }
}
