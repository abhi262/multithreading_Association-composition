package Core;

import java.util.Scanner;

//Array-object//heap//
public class Array {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = { 10, 20, 30 };// initialization
		int i;
		Scanner sc = new Scanner(System.in);
		Array obj=new Array();
		System.out.println("enter array");
		for (i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("array is");
		for (i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
		for (i = 0; i < 3; i++) {
			System.out.println("b is " + b[i]);
		}
	obj.array();
	}

	public void array() {
		Scanner sc1 = new Scanner(System.in);//create the scanner object with differnt name if same object name it conflict/ambugity
		int[][] a = new int[2][3];
		

		System.out.println("enter the new array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
			
				a[i][j] = sc1.nextInt();
			}
		}
		System.out.println("array is:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
