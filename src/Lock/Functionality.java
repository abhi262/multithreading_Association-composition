package Lock;

public class Functionality extends Thread {
  private  Resource res;
   Functionality(Resource res){
	   this.res=res;
   }
   @Override
	public void run() {
		String str=Thread.currentThread().getName();
		if(str.equalsIgnoreCase("t1")){
			synchronized (res) {
				res.printer(str); 	
			}
		     
		}
//		else if(str.equalsIgnoreCase("t2")) {
			synchronized (res) {
				res.disp(str);
//			}
			
		}
		
	}
}
