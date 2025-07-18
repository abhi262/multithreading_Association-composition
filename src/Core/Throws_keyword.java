package Core;


public class Throws_keyword {
	public static void main(String[] args) {
		Ba ob1 = new Ba();
		try {
			ob1.exception1();
			throw new Na("you are not eligible");
		} catch (Na e) {
			
       System.out.println(e);
		}
		try {
			ob1.exception2();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("exception solved");
		ob1.StringRevison();
         
	}
	
}

class Ba {

	public void exception1()throws ArithmeticException {
		System.out.println("done1");
//      int k=2/0;
      System.out.println("done1");
	}

	public void StringRevison() {
     
	String s1="abhijeet";
	String s2="abhijeet";
	String s3=new String("abhijeet");
	String s4=new String("abhijeet");
	StringBuffer s6=new StringBuffer("raj");
	StringBuffer s7=new StringBuffer("raj");
	String s5=null;
	System.out.println(s1.length());
	System.out.println(s1.equals(s2));
	if(s1==s2) {
		System.out.println("true");
	}
	System.out.println(s1.trim());
	System.out.println(s1.charAt(2));
	System.out.println(s1.toCharArray());
	System.out.println(s1.concat("abhijee"));
	System.out.println(s1.toString());
	System.out.println(s1.indexOf(3));
	System.out.println(s1.join("-", s1,s2,s3));
	System.out.println();
	System.out.println(s3.equals(s4));
	System.out.println(s6);
	System.out.println(s6.append("kumar"));
	System.out.println(s6);
//     System.out.println(s6.reverse());
     System.out.println(s6.equals(s7));
     StringBuffer s8=s6.append(s7);
    System.out.println(s6.equals(s8));
	}

	public void exception2()throws ArithmeticException {
    int k=2/0;
    System.out.println("done2");
	}
	

}
class Na extends RuntimeException{

	
	public Na(String str) {
		super();
	}

}
