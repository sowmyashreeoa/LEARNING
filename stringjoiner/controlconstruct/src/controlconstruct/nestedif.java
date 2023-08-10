package controlconstruct;

import java.util.Scanner;

public class nestedif {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the age");
		int age=scan.nextInt();
		System.out.println("enter the weight");
		int weight=scan.nextInt();
		if(age>18) {
			if(weight>50) {
				System.out.println("your eligible for blood donation");
			}
		}
		System.out.println("your not eligible for blood donation");
	}

}
