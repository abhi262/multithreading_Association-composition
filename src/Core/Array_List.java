package Core;

//ArrayList
//->ArrayList ob1 = new ArrayList()
//->ArrayList obj=new ArrayList(8);//with initial capacity
//->ArrayList o1=new ArrayList(ob1);//assigning one object into other object
import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

	public static void main(String[] args) {
		
		// ob1 is collection object and raj is obejct inside collection object
		Scanner sc = new Scanner(System.in);
	    int size;
        System.out.println("enter size");
        size=sc.nextInt();
		ArrayList ob1 = new ArrayList();
		ArrayList ob2 = new ArrayList();
		ArrayList ob3 = new ArrayList();
		// arraylist with generic type
		ArrayList<Integer> c1 = new ArrayList<Integer>();
		// getting input fromuser
		ArrayList<String> s1 = new ArrayList<String>();

		c1.add(1);
		c1.add(23);
		c1.add(24);
		c1.add(null);
		ob1.add(100);// 100 is also a object
		ob1.add("abhijeet");
		ob1.add("raj");
		ob1.add(100);// 100 is also a object
		ob1.add("abhijeet");
		ob1.add("raj");
		System.out.println("array list ob1:" + ob1);
		ob2.add(10000);// 10000 is also a object
		ob2.add("abhijeetkumar");
		System.out.println("array list ob2:" + ob2);
		ob1.addAll(ob2);
		System.out.println("after adding ob2 into ob1 updated ob1:" + ob1);
		// give first occurence
		System.out.println("raj present at ob1 at what index:" + ob1.indexOf("raj"));
		// if not present return -1
		System.out.println("k present in ob1:" + ob1.indexOf("k"));
		// contain//return boolean yes or no
		System.out.println("raj conatin in ob1:" + ob1.contains("raj"));
		// last indexof oject present
		System.out.println("last index of raj present:" + ob1.lastIndexOf("raj"));
		// clone
		ob3 = (ArrayList) ob2.clone();// cast
		System.out.println("after clone ob3:" + ob3);
		// to array
		Object[] ob4 = new Object[10];
		ob2.toArray(ob4);
		System.out.println("return an array containing all of the elements in this list:" + ob4[1]);
		// isEmpty()
		System.out.println("ob1 is empty:" + ob1.isEmpty());
		// remove from particular index
		System.out.println("remove  from index 2 ob1: " + ob1.remove(2));
		System.out.println(ob1);
		// remove particluar object //return boolean
		System.out.println("remove raj from ob1:" + ob1.remove("raj"));
		// sublist(from,to index)
		Object o = new Object(); // create object and assigned
		o = ob1.subList(3, 6);
		System.out.println("sublist from 3 to 6:" + o);
//    clear to clear lis
		ob2.clear();
		System.out.println("clear ob2:" + ob2);
		// sort(if same type of data in list)
//    ob1.sort(null);
		System.out.println("after sort ob1:" + ob1);
		// size
		System.out.println("size of array_list:" + ob1.size());
		// get method
		System.out.println("get method:" + ob1.get(3));
		ArrayList o1 = new ArrayList(ob1);// assign data of one array list into other
		System.out.println("obj:" + o1);
		System.out.println("generic data type:" + c1);
		System.out.println("enter data for s1:");
        for(int i=0;i<size;i++) {
         String s2=sc.next();
         s1.add(s2);
       
        }
        System.out.println("array list s1:"+s1);
        //advanced for loop
        for(String s:s1) {
        	System.out.println(s);
        }
        int k=8;
        System.out.println(k++);
	}
}
