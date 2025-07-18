package Core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//List(class of list):list is interface so we can create the object of inherited class
//set(class of set):map is interface so we can create the object of inherited class 
import java.util.List;//
import java.util.Set;

public class List_Set {
	public static void main(String[] args) {
		List obj = new ArrayList();// create the object of implemented class and pass refrence
		Set obj1 = new HashSet();// create the object of implemented class and pass refrence
		obj.add("abhi");
		obj.add("34");
		obj.add('A');// duplcate allowed in list
		obj.add('A');
		obj.add(1, "raj");// set at index 1 and remainings shift(index based system )
		obj.add(null);
		obj.add(4, null);// allowed multiple null bcz duplicate allowed
//	 System.out.println("List:"+obj);//List follow the insertion order means sequence correct
		obj1.add("hash1");// (not index based)
		obj1.add("hash2");
		obj1.add("hash1");// duplicate not allowed in map
		obj1.add(null);// single null allowed bcz doesnt allow duplicate added but not show
		obj1.add(null);
//	 System.out.println("hash:"+obj1);//set doesn't follow insertion order(Sequence not same)
//	------------List and Set can access through iterator-----------------------
//	 hasNext();//return boolean if next element present true otherwise false
//	 .next();return the next element
		Iterator it = obj.iterator();
		while (it.hasNext()) {
			System.out.println("list is:" + it.next());
		}
		// set value access using iterator
		Iterator it1 = obj1.iterator();
		System.out.println("set value:");
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
