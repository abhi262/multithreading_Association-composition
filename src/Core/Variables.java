package Core;
//variable allocate memory- when object created//the name assigned to memory to store the value/literal
public class Variables {
    public int instance=7;//instance variable//inside non-static method//static method(object of that class)//heap//modifier applicable
    private char instance2='B';
    protected String u="instance 3 ";
    static int new1 =12;//no heap//acess-directly,using class,using object//modifier applied//point same memory location(show update one)
	public static void main(String[] args) {
		int a=10;//local variable//stack//within block/modifier not applicable
		Variables obj=new Variables();
        obj.display();
        System.out.println("a is:"+a);
        System.out.println("instance variable in static method:"+obj.instance);
        System.out.println("instance2 in static :"+obj.instance2);
        System.out.println("instance2 in static :"+obj.u);
        obj.instance=100;
        System.out.println("instance after updated"+obj.instance);
        System.out.println("staic variable directly:"+new1);//directly
        System.out.println("staic variable using class:"+Variables.new1);//using class
        System.out.println("static variable using object:"+obj.new1);//using object
        Variables ob3=new Variables();
        ob3.new1=500;
        Variables ob4=new Variables();
        ob4.new1=600;
        System.out.println("static variable using object inside static method:"+ob4.new1);//using object obj4
        System.out.println("static variable using object inside static method: ob3:"+ob3 .new1);//using object ob3
	}
   public void display() {
	   int b=20;
	   System.out.println("b is"+b);
//	   System.out.println("a is"+a);
       System.out.println("instance variable in non-static method:"+instance);
       System.out.println("instance2 in non-static :"+instance2);
       System.out.println("instance2 in non-static :"+u);
       Variables obj1=new Variables();
       obj1.instance=200;
       System.out.println("instance after updated:"+obj1.instance);
       System.out.println("staic variable directly:"+new1);//directly
       System.out.println("staic variable using class:"+Variables.new1);//using class
       System.out.println("static variable using object"+obj1.new1);//using object
       Variables ob3=new Variables();
       ob3.new1=500;
       Variables ob4=new Variables();
       ob4.new1=600;
       System.out.println("static variable using object:"+obj1.new1);//using object obj1
       System.out.println("static variable using object ob3:"+ob3 .new1);//using object ob3
       System.out.println("static variable using object ob4:"+ob4 .new1);//using object ob4
		System.out.println("static variable using class Variables:" + Variables.new1);// using object ob4
	}
}
