package Employee;

import java.util.HashMap;
import java.util.Scanner;
public class Emp {
	public int emp_id,age;
	String name;
	HashMap<String, Object> ob1=new HashMap<String, Object>();
    public Emp() {
	   System.out.println("Employee view created");
    }
   public void add_Employee() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter id");
	   emp_id=sc.nextInt();
	   sc.nextLine();
	   System.out.println("enter name");
	   name=sc.nextLine();
	   System.out.println("enter age");
	   age=sc.nextInt();
	   ob1.put("id", emp_id);
	   ob1.put("name", name);
	   ob1.put("age", age);
//	   System.out.println(ob1.get(id));

   }
   public void disp() {
	   System.out.println("Employee Detail....");
	   System.out.println("id||   name   ||  age");
	   System.out.println(""+ob1.get("id")+ "||"+ob1.get("name")+ "||" +ob1.get("age"));
   }
}

