package Core;
import java.util.LinkedList;
//linkedlist:duplicate,null allowed//
public class Linked_list {
  public static void main(String[] args) {
	  LinkedList obj=new LinkedList();
//	  add
	  obj.add("abhi");
	  obj.add("raj");
	  obj.add(3);
	  obj.add(3);
	  //replace
	  obj.add(1, 20.5);//replace 1 and shift other by 1
	  obj.add(null);
	  //add collection object at particluar index
//	  obj.addAll(4,obj1);
	  obj.addLast("last");
	  obj.addFirst("first");
	  System.out.println(obj);
	  //getfirst
	  System.out.println("get first:"+obj.getFirst());
	  //getlast
	  System.out.println("get last:"+obj.getLast());
	  //remove last
    Object o1=(String) obj.removeLast();
    System.out.println(o1);
    //lastone removed
    System.out.println(obj);
    //contain
    System.out.println("contain:"+obj.contains(3));
    //size
    System.out.println("size of list:"+obj.size());
    //get the element at index
    System.out.println("at index 5:"+obj.get(5));
    //set the elemet at index and replace and remove  and return the delete
    System.out.println("set at 1:"+obj.set(1, "new"));
    System.out.println(obj);
    //3 present at index 4 if not present -1
    System.out.println(obj.indexOf(3));
    //3 present at which last index
    System.out.println("last index of :"+obj.lastIndexOf(3));
    //OBJ1 LIINKED LIST
    //copy obj into obj1 then addd
	  LinkedList obj1=new LinkedList(obj);
	  obj1.add("1");
	  obj1.add(2);
//	  obj1.sort(null); if same type of data in the list
    System.out.println(obj1);
    //in obj obj1  all obj elemet are present return true or false
    System.out.println("conatin all:"+obj1.containsAll(obj));
}
}