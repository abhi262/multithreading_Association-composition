package Core;
class Employee{
	String name;
	int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public void show() {
		System.out.println("name is:"+name+" id is:"+id);
	}
}
public class Constructor {

	public static void main(String[] args) {
 Employee ob1=new Employee("abhijet", 12);
 Employee ob2=new Employee("amit", 23);
 ob1.show();
 ob2.show();
	}

}
