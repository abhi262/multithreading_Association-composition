package Employee;

import java.util.Scanner;

public class Employee_Fun {
	public static void main(String[] args) {
		Emp ob1 = new Emp();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice \n 1)add employee 2)display 6)Exit");
		int ch;
		ch = sc.nextInt();
		switch (ch) {
		case 1: {
			ob1.add_Employee();
			main(args);
			return;
		}
		case 2: {
			ob1.disp();
		}
		case 6:{
//			System.out.println("application end");
			System.err.print("application end");
			System.exit(0);
		}
		}

	}
}
