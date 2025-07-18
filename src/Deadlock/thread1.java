package Deadlock;

public class thread1 {
  public static void main(String[] args) {
	  Resource r1=new Resource();
	  Resource r2=new Resource();
	  r1.setName("raju");
	  r2.setName("kaju");
	  r1.start();
	  r2.start();
	  
}
  
}
