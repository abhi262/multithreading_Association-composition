package Deadlock;

public class Resource extends Thread{
//	resource means object releated
    String s1="res1";//resource 1
    String s2="res2";//resource 2
    String s3="res3";//resource 3
    
    @Override
    public void run() {
    	String str=Thread.currentThread().getName();
    	if(str.equalsIgnoreCase("raju")) {
    		rajuaccess(str);
    	}
    	else {
    		kajuaccess(str);
    	}
    	

    }
	private void kajuaccess(String str) {
		synchronized (s1) { //locking the resource 
        	System.out.println(" "+s1+" using "+Thread.currentThread().getName());	
        	synchronized (s2) {
            	System.out.println(" "+s2+" using  "+Thread.currentThread().getName());
            	synchronized (s3) {
                	System.out.println(" "+s3+" using "+Thread.currentThread().getName());
        	
        		}
    		}
		}
    	
    	
		
	}
	private void rajuaccess(String str) {
		synchronized (s3) { //locking the resource 
        	System.out.println(" "+s1+" using "+Thread.currentThread().getName());	
        	synchronized (s2) {
            	System.out.println(" "+s2+" using  "+Thread.currentThread().getName());
            	synchronized (s1) {
                	System.out.println(" "+s3+" using "+Thread.currentThread().getName());
        	
        		}
    		}
		}
	}
    
}
