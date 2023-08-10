package temperatureconverter;
import java.util.*;

public class temperatureconverterapp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the fehernit value");
		double f=sc.nextDouble();
		temperatureconverter tc=new temperatureconverter();
		double convertedvalue=tc.convertFaherenheitToCelisus(f);
		System.out.println("converted value is"+convertedvalue);
		System.out.println();
}
}
