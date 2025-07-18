package Core;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a, b;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a:");
		a = sc.nextInt();
		System.out.println("enter the b:");
		b = sc.nextInt();
		System.out.println("enter the choice ");
		ch = sc.next().charAt(0);
		switch (ch) {
		case '+': {
         int result=a+b;
         System.out.println("add is "+result);
         break;
		}
		case '-':{
			int result=a-b;
	         System.out.println("subtract is "+result);
	         break;
		}
		case '*':{
			int result=a*b;
	         System.out.println("multiply is "+result);
	         break;
	         
		}
		default:{
			System.out.println("invalid entry");
			break;
		}
		}
	}

}
