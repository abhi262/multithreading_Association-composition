package Core;

import java.util.Scanner;
import java.util.LinkedList;

class Gen_Linked<E> {
	LinkedList<E> obj = new LinkedList<E>();

	void add_Data(E a) {		
		obj.add(a);
	}
	public void operation(E a) {
		obj.addFirst(a);
	}
	void set_Replace(E a) {
		obj.set(2, a);
	}
	void show() {
		System.out.println("linkedlist data is:"+obj);
	}
}

public class Generic_LInkedlist {
	public static void main(String[] args) {
		Gen_Linked<Integer> obj = new Gen_Linked<Integer>();// for int datatype
		Gen_Linked<String> obj1 = new Gen_Linked<String>();// for string datatype
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		id = sc.nextInt();
		 sc.nextLine();
		System.out.println("enter name");
		name = sc.nextLine();
		obj.add_Data(id);
		obj.add_Data(234);
		obj1.add_Data(name);
		obj1.add_Data("abhi");
		obj.add_Data(23);
		obj1.add_Data("raj");
		System.out.println("enter the number we want to set and replace previous one");
		int i;
		i=sc.nextInt();
		obj.set_Replace(i);
		obj.show();
		obj1.show();
	}
}
