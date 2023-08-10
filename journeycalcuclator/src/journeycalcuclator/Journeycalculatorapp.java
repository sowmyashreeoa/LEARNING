package journeycalcuclator;
import java.util.*;

public class Journeycalculatorapp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter speed and distance");
		double speed=sc.nextInt();
		double time=sc.nextInt();
		journeycalculator jc=new journeycalculator();
        double distance=jc.calculateDistance(speed,time);
        System.out.println("distance is"+distance);
	}

}
