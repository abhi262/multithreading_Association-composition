package Core;

public class Constant {
	public static void main(String[] args) {
		final int Abhijeet_id = 2; // constant same like enum value are set at compile time only
		final String Abhijeet_Name = "Abhijeet";
		final int SIZE = 10;
		int[] arr = new int[SIZE];
		final int STATUS_ACTIVE = 1;
		 final int STATUS_INACTIVE = 0;
		if ("Abhijeet" == Abhijeet_Name) {
			System.out.println("true");
		}
		switch (2) {
		case 1: {
			System.out.println("case 1");
			break;
		}
		case Abhijeet_id: {
			System.out.println("case 2");
			
			System.out.println(User_data.abhijeet);
			System.out.println(User_data.abhijeet.ordinal());
		}
		}
	}
}
