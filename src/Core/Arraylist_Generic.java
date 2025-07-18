package Core;
//generic:means replace T with the datatype with which object i m using
//listiterator can use with list
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Generic<T>{
	ArrayList<T> obj=new ArrayList<T>();
	public void add(T a) {
	obj.add(a);
	}
	public void show() {
		System.out.println("list");
		ListIterator<T> it =obj.listIterator();
		while(it.hasNext()) {
			it.next();
		}
	  while(it.hasPrevious()) {
		  System.out.println(it.previous());
	  }
	}
}
public class Arraylist_Generic {
   public static void main(String[] args) {
	   Generic<Integer> obj=new Generic();
	   Generic<String> ob1=new Generic();
	   obj.add(200);
	   obj.add(200);
	   obj.add(200);
	   obj.add(null);
	   obj.show();
	   ob1.add("raj");
	   ob1.add("abhi");
	   System.out.println("string is:");
	   ob1.show();
}
}
