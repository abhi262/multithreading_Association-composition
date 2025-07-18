package Core;

//import javax.xml.crypto.Data;

public class String_Function {

	public static void main(String[] args) {
		String s1="abhijeet";
		String s2="abhishek";
		StringBuffer s3=new StringBuffer("abhi");
		StringBuffer s4=new StringBuffer("apple banana");
//		System.out.println();
//	    String s5=new String(2);
		StringBuffer s7=new StringBuffer("raj");
		StringBuffer s6=new StringBuffer(6);
//	    System.out.println("strin"+s7.trimToSize());
		s7.trimToSize();//because void not return
		s6.append("raj");
		s6.append("abhijeet");
		System.out.println("appending....."+s7.capacity());
//		System.out.println(StringBu);
		System.out.println(s7.length());
		System.out.println(s7.reverse());
		System.out.println(s4.insert(3, "MM."));
//		System.out.println(s7.delete(1, 2));
		StringBuffer s8=new StringBuffer("america");
		System.out.println(s8.delete(1, 2));
		System.out.println(s2.substring(2));
//		System.out.println(s2.to?);
//		System.out.println(s2.toCharArray());
		char p[]=new char[10];
				p=s2.toCharArray();
			System.out.println(p[3]);
		System.out.println("append:"+s6);
		s4.append("raj");
		System.out.println("after appending:"+s4);
		int b=20;
		System.out.println(s1.equals(s2));
		if(s1==s2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
       int a[]= {1,2,3};
       disp(10,a);
//       System.out.println(String.valueOf(b));
       String m=String.valueOf(b);
       System.out.println(m);
       String k=m+10;
       System.out.println(k);
       System.out.println(s1.substring(0, 2));
       System.out.println(s1);
       System.out.println(s3.substring(0, 2));
       System.out.println(s3.append('e'));
       System.out.println(s1.concat("abhue"));
       System.out.println(s1.indexOf('i'));
       System.out.println(s1.replace('i', 'm'));
       System.out.println(s1.charAt(1));
       System.out.println(s1.toUpperCase());
       System.out.println(s1.isEmpty());
       System.out.println(s1.length());
       System.out.println(s1.trim());
       System.out.println(s1.join(";",s1,s2));
       System.out.println(s1);
       System.out.println(s3);
   
	}

	private static void disp(int b,int... a) {
//		for(int m:a) {
//			System.out.println(m);
//			System.out.println(b);
//		}
		System.out.println(".................................................");
		StringBuffer s1=new StringBuffer("abhi");
		StringBuffer s2=new StringBuffer("abhi");
		String s3=new String("abhi");
		String s4=new String("abhi");
		StringBuffer s5=s1.append("abhi");
		System.out.println(s1.equals(s5));
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s2));
		  System.out.println(s1.subSequence(1, 4));
		  
		  System.out.println(s1.substring(1, 4));
		  s2.setLength(2);
		  System.out.println(s2);
       StringBuilder so1=new StringBuilder("abhijeet");
       System.out.println(so1.append("new"));
       System.out.println(so1.length());
       System.out.println(so1.reverse());
       so1.setCharAt(2, 'm');
       so1.setLength(4);
       System.out.println(so1.substring(3));
       
//       System.out.println(so1.setCharAt(2, 'm'));
       System.out.println(so1);
       String s9=new String("Abbbbbhijeetttt");
       char r1[]=s9.toCharArray();
       int i,j,m=0;
       char max=6222;
     System.out.println("length:"+r1.length);
     for(i=0;i<r1.length-1;i++) {
    	 for(j=i;j<=i;j++) {
    		 if(r1[j]==r1[j+1] && max<=6222) {
    			 max=r1[j];
    			 m++;
    		 }
    	 }
     }
       System.out.println("max:"+max);
       System.out.println("max:"+m);

		System.out.println(".................................................");
		
	}

}
