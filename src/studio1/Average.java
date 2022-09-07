package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for n1: ");
		double n1 = in.nextDouble();
		System.out.print("Enter value for n2: ");
		double n2 = in.nextDouble();
		double avg = (n1+n2)/2.0;
		System.out.println("Average of "+n1+" and "+n2+" is "+avg+".");
	}

}
