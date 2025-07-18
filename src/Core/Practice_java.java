package Core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Practice_java {
   
   public static void main(String[] args) {
	   List obj=new ArrayList();
	   Set ob1=new HashSet();
	   ob1.add("abhi");
	   ob1.add("abhi23");
	   ob1.add("abhi23");
	   ob1.add("abhi");
	   ob1.add(null);
	   obj.add("abhi");
	   obj.add("abhi");
	   obj.add("abhi");
	   obj.add("abhi");
	   Iterator i1=obj.iterator();
	   Iterator i3=ob1.iterator();
	   ListIterator i2=obj.listIterator();
	   System.out.println("list is:");
	    while(i1.hasNext()) {
	    	System.out.println(i1.next());
	    }
	    System.out.println("in reverse direction");
	    while(i2.hasNext()) {
	    	i2.next();
	    }
	   i2.set("replace");
	    while(i2.hasPrevious()) {
	    	System.out.println(i2.previous());
	    }
	    System.out.println("set is");
	     while(i3.hasNext()) {
	    	 System.out.println(i3.next());
	     }
}
    
}
