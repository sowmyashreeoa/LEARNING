package controlconstruct;

import java.util.Scanner;

public class nestedifelse {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the value of A");
	int A=scan.nextInt();
	System.out.println("enter the value of B");
	int B=scan.nextInt();
	System.out.println("enter the value of C");
	int C=scan.nextInt();
	
	if(A>B ) {
		if(A>C) {
			System.out.println("A is greater number");
			}
		else
			System.out.println("C is greater number");
	}
	else
	{
		if(B>C)
			System.out.println("B is greater number");
		else
			System.out.println("C is greater number");
	}

}
}
