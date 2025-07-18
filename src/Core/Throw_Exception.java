package Core;

public class Throw_Exception {
	public static void main(String[] args) {
		int age = 16;
		try {
			if (age < 18) {
//		  throw new ArithmeticException(); userdefined Exception
				throw new Custom_Exception("not eligible");
			} else {
				System.out.println("you are eligible");
			}
		} catch (Custom_Exception e ) { //Exception e
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
