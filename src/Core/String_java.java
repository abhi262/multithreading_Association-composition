package Core;
//String:is a class
public class String_java {
   public static void main(String[] args) {
	   char[] a= {'A','B'};
	   byte[] b= {102,102,3};
	   String n4=new String(b);
	   System.out.println("byte:"+n4);
	   String n3=new String(a);
	   String o1=null;
	System.out.println("character constrcutor in string:"+n3);
	  String s1=" abhi jeet  ";
	  String s2="abhijeet";
	  String s3=new String("abhijeet");
	  String s4=new String("abhijeet");
	  String s8=new String();
	  StringBuilder s9=new StringBuilder("abhijeet");//mutable object
	  StringBuffer s10=new StringBuffer("rajeev");
	  String n2=new String(s10);
	  System.out.println("String buffer:"+s10);
	  s10.append("kumar");
	  System.out.println("mutable object stringbuffer:"+n2);
	  String n1=new String(s9);//convert into immutable object
	  System.out.println(s9);
	  s9.delete(2, 5);
	  System.out.println(s9);
	  System.out.println(" convert into immutable object:"+n1);
//	  System.out.println(s8.isEmpty());
//	  System.out.println(s3.equals(s4)); compare the content not address
//	  System.out.println(s1.charAt(3));
//	  System.out.println(s1.codePointBefore(2));
//	  System.out.println(s1.compareTo(s2));
//	  System.out.println(s1.subSequence(0, 3));
//	  System.out.println(s1.concat(s4));
//	  System.out.println(s1.indexOf("hi"));
//	  System.out.println(s1.lastIndexOf("hi"));
//	  System.out.println(s1.equals(s2));
//	  System.out.println(s1.substring(3));
//	  System.out.println(s1.length());
//	  System.out.println(s1.trim());
//	  System.out.println(s1.lastIndexOf(106, 0));
//	  System.out.println(s1.equals(s2));
//	  System.out.println(s3.equals(s4));
	  if(s1==s2) {
		  System.out.println("true"); //inside scp so compare the address both object pointing to same address or not
	  }
	  if(s3==s4) {
		  System.out.println("true s3==s4");//not inside scp
	  }
	String s5=  s1.toUpperCase();//doesn't change the value its returns the object
	  System.out.println(s5);
	String s6= s3.intern();//to put the string into scp and return the object
	String s7= s4.intern();
	 if(s6==s7) {
		 System.out.println("true s3==s4"); 
	 }
	 if(s1==s6) {
		 System.out.println("is s1 =s3");
	 }
	 System.out.println(s2.length());

//  System.out.println(o1.length() );
//	 System.out.println(o1.isEmpty());
	 System.out.println(s2.isEmpty());
//	 System.out.println(s1.trim().length());
//	 String k=s1.trim();
//	 System.out.println(k);
	String k2= s1.replace('a', 'b');
	System.out.println(s1);
	 System.out.println(k2);
	
	   String k3="abhi"; String k4="ABHI";
		 
		/*
		 * StringBuffer k3=new StringBuffer("abhi"); StringBuffer k4=new
		 * StringBuffer("ABHI");
		 */
//	 System.out.println(k3.equalsIgnoreCase(k4));//it ignore upper and lower case 
//	 System.out.println(k3.compareTo(k4));
//	 System.out.println(k3.compareToIgnoreCase(k4));
//	 System.out.println("concatation is:"+s1.trim().concat(s2));
//	 System.out.println("join is:"+s1.join(s2));
//	  System.out.println(s1.join(",",s1,s2));
	   System.out.println(String.join("!","ravi","raj"));
//	   System.out.println(s1.substring(2));
//	   System.out.println(s1.subSequence(2, 6));
//	   System.out.println(s1.replace('i', 'k'));
//	   System.out.println(s1.replaceFirst("i","k"));
//	   System.out.println(s1.replaceAll("e", "m"));
//	   System.out.println(s1.replaceAll("i(.*)", "k"));
//	   System.out.println(s1.index);
	   int i=10;
//	   System.out.println(String.valueOf(i));
	   	  
}
   //types of constructor in java
//   public String_java() {
//		 
//	 }
//   public String_java(String s) {
//	   
//   }
//   public String_java(StringBuilder s ) {
//	   
//   }
//   public String_java(StringBuffer s) {
//	   
//   }
//   public String_java(char[] a) {
//	   
//   }
//   public String_java(Byte b) {
//	   
//   }
}
