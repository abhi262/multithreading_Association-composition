package Core;
//identifier is any name like classname,variable_name,method_name.,variable_name_,interface_name	
public class Operator_literal {
    int a =10;//10 is literal means value assigned to variable
    static int b=20;
	public static void main(String[] args) {
		Operator_literal obj=new Operator_literal();
     System.out.println("divide:"+b/obj.a);
//     System.out.println("pre increment:"+(++b));
//     System.out.println("post increment:"+(b++));
     if(obj.a==b) {
    	 System.out.println("equal");
     }
     if(obj.a!=b) {
    	System.out.println("not equal"); 
     }
     if((obj.a+b<=10) || (obj.a+b<=30 ) ){
    	 System.out.println("or condition sataisfied");
     }
     if((obj.a+b<=30) || (obj.a+b<=30 ) ){
    	 System.out.println("and condition sataisfied");
     }
     boolean b=true;
     System.out.println("not operator:"+!true);
     //ternary operator
//     condition ? expression_if_true : expression_if_false;
     int c;
     boolean new1;
      new1= (obj.a > Operator_literal.b) ?true:false;
      System.out.println("ternary:"+new1);
	}
   
}
//bydefault class name in any package :package-private (also known as default) access. This means the class is accessible only to other classes within the same package.
//only one public class in a single package: In Java, a public class must be declared in a file with the same name as the class. For instance, if a class is named MyClass, the file must be named MyClass.java. 
//This naming convention is important for the Java compiler and the JVM to work correctly.