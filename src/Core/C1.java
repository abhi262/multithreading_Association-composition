package Core;

import java.util.ArrayList;
import java.util.HashSet;
//Collection:is object of classes like arraylist,hashset
//and this method is present in collection interface so it can used by all inherit class of collection
//a)add:to add object in the collection class object 
//b)addall:it is used to combine two collection object/return boolean value
//c)contain(object):its also come under the collection add(100);so here 100 is also a object this method check the object is present in the collection object or not hs.contain("amit") if contain then true otherwise false
//d)isEmpty():return boolean is collection object empty or not
//e)
public class C1 {
	public static void main(String[] args) {
		ArrayList ob = new ArrayList();
		ob.add("raj");
		ob.add("raj1");
		ob.add(200);
		System.out.println("Add is:" + ob);
		ArrayList ob1 = new ArrayList();
		ob1.add("abhijeet");
		ob1.add(200);
		System.out.println("Add is:" + ob1);
		ob1.addAll(ob);
		System.out.println("add ob in ob1:" + ob1);
		ob.addAll(ob1);
		// now ob1 updated ob1 [abhijeet, 200, raj, raj1, 200]
		System.out.println("add ob1 in ob:" + ob);
		ob1.addAll(ob);
		// now object(ob)update after addall [raj, raj1, 200, abhijeet, 200, raj, raj1,
		// 200]
		System.out.println("add ob in ob1:" + ob1);
		// hashset
		HashSet hs = new HashSet();
		hs.add("abt");
		hs.add("123");
		System.out.println("hashset object hs:" + hs);
		HashSet hs1 = new HashSet();
		hs1.add("amit");
		hs1.add(34);
		System.out.println("hashset object hs1:" + hs1);
		hs.addAll(hs1);
		System.out.println("hashset object hs:" + hs);
		System.out.println(hs.add("true or false"));// if add true otherwise false
		boolean b = hs1.contains("amit");// amit object is present in collection object hs1 or not
		System.out.println("amit present in hs1:" + b);
		System.out.println("hs1 is empty :" + hs1.isEmpty());
		System.out.println("raj object present at index in ob:" + ob.indexOf("raj"));
		System.out.println("raj1 object present at index in ob:" + ob.indexOf("raj1"));
		System.out.println("ob" + ob);
		// means raj object present at which last index
		System.out.println("raj object present at index in ob:" + ob.lastIndexOf("raj"));
          Object n1=new ArrayList();
        n1=  ob.clone();
        System.out.println("clone:"+n1);
        System.out.println("at specified position:"+((ArrayList) n1).get(3));
        System.out.println("remove element:"+((ArrayList) n1).remove("raj1"));
        System.out.println("clone:"+n1);
        System.out.println("sublist:"+ob.subList(1, 3));
        Object o=new Object();
        o=ob.subList(1, 3);
        System.out.println(o);
       ob.subList(1, 3).clear();
       System.out.println("after remove:"+ob);
	}
}
