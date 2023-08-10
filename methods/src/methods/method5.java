package methods;

import java.util.Scanner;

public class method5 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	method5 method5=new method5();
	method5.fact(num);
}
void fact(int num) {
	int i,fact=1;
	for(i=1;i<=num;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
