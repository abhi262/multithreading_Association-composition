package Core;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

//iterator:alll collection object//forward direction//next,hasnext,remove
//listiterator:only list implemented class//all direction,next,hasnext,previosu ,hasprevious,set,remove
//enumeration:is used for legacy class vector,stack//duplicate and multiple null allowed bcz it inherit list
public class Iteration_ways {
	public static void main(String[] args) {
		List obj = new ArrayList();
		List obj1 = new ArrayList();
		Vector v1=new Vector();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(3);
		v1.add(null);
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj.add("raj");
		obj.add("abhi");
		Iterator it = obj.iterator();// iterator
		ListIterator it1 = obj1.listIterator();
		System.out.println("list iterator");
		int i = 0;
		while (it.hasNext()) {
			i++;
			if (i == 1) {
				System.out.println(it.next());
				it.remove();
			}

		}

		System.out.println("list iterator");
		// Move to the end of obj1 list first
		while (it1.hasNext()) {
			it1.next(); // Moving to the last element
		}
		while (it1.hasPrevious()) {
			System.out.println(it1.previous());
		}
		Enumeration e1=v1.elements();
		System.out.println("Enumeration:");
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}
}
