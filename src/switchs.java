import java.util.Scanner;

public class switchs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b");
		int a, b;
		char c;

		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("enter choice");
		c = sc.next().charAt(0);
		switch (c) {
		case '+': {

			int sum = a + b;
			System.out.println(sum);
		}
		case '-': {
			int sub = a - b;
			System.out.println(sub);
		}
		default: {
			System.out.println("invalid");
		}
		}
	}
}
