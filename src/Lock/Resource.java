package Lock;
public class Resource {
    public int a=10;
    public void printer(String str) {
    	for(int i=0;i<100;i++) {
    		System.out.println("thread"+str+" accesing the resource");
    	}
    	
    }
    public void disp(String str) {
    	System.out.println("thread "+str+" access");
    }
}
