package controlconstruct;
import java.util.*;

public class demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=sc.nextInt();
		constructmethods cs=new constructmethods();
		cs.gradecalculator(marks);
	}

}
