package controlconstruct;
public class constructmethods {
	void gradecalculator(int marks){

	if(marks>=90)
		System.out.println("A+ grade");
	else if(marks>=80&& marks<90)
		System.out.println("A grade");
	else if(marks>=70&& marks<80)
		System.out.println("B grade");
	else if(marks>=60&& marks<70)
		System.out.println("C grade");
	else if(marks>=50&& marks<60)
		System.out.println("D grade");
	else
		System.out.println("FAIL");
	}
}
