package Thread_Data;

public class Crd extends Thread {
	Balance bal;
	Database1 d1;

	public Crd(Balance b1, Database1 d1) {
		this.bal = b1;
		this.d1 = d1;
	}

//	 public int balance=500000;
	@Override
	public void run() {
//	 Account ob=new Account();
		String str = Thread.currentThread().getName();
		System.out.println(str);
		if (str.equalsIgnoreCase("person1")) {
			withdrwal(2);
		} else if (str.equalsIgnoreCase("person2")) {
			withdrwal(2);
		}
//	 System.out.println(bal.balance);
	}

//here make withdrawl as synchronized so only thread acess at a resource withdrwal at a time
	// run is not synchronized dont need to synchronized we synchronized resource
	// i,e method
	private void withdrwal(int m) {
		synchronized (bal) { // synchronized resource present in balance class so lock balance class object
// so in that case locking balnce clss object so no any other thread can access the bal object resource (int balance)
//			until thread complete its exceution
			for (int i = 0; i < 100000; i++) {
//		bal.balance=bal.balance-(2*100000);/if i write directly show correct output 1lakhs remaing after 4lakh deduct from both
				bal.balance = bal.balance - m;
				bal.disp();
			}
			synchronized (d1) {
				System.out.println(d1.m);
			}
//	System.out.println("debit succesfully the remainig balance:"+bal.balance+" from"+Thread.currentThread().getName());
		}
		
	}
}
