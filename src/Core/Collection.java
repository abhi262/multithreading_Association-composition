package Core;

import java.util.ArrayList;
import java.util.HashMap;//import hash class and create object and access method inside class
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
//collection object:the object of array list obj and hashset obj1 is the collectionlist and it store data directly as inside object in form of object
//Map:stored data in key valued paired
class Map{
	void disp() {
		HashMap ob6=new HashMap();
		ob6.put(1, "abhijeet");
		ob6.put(2, "abhijeet1");
		ob6.put(2, "abhijeet1");
//		inteface refrence
//		Map o=new HashMap();
		Vector ob=new Vector();
		ob.add("amit");
		System.out.println("vector:"+ob);
		
	}
}
public class Collection {
public static void main(String[] args) {
	Map ob=new Map();
	ob.disp();
	   ArrayList obj=new ArrayList();
	   obj.add("abhijeet");
	   obj.add(30);
	   System.out.println("array list:"+obj);
	   ArrayList o=new ArrayList();
	   o.add("abhi");
	   o.add("abhi2");
	   o.addAll(obj);
	   System.out.println(o);
	   HashSet ob1=new HashSet();
	   ob1.add("raj");
//	   list is interface so cant create the object so create the object of inherited class array list,linkedlist and provide the refrence to list
	   List ob2=new ArrayList();
	   ob2.add("abhijeet");
	   //can give refrence of hash set bcz hashset cannot inherit list hash inherit set so only inherited method can give the refrence 
//	   List ob3=new HashSet();
	   Set ob4=new HashSet();//here hashset inherit set so we can give refrence 
	    ob4.add("amit");
}
}
