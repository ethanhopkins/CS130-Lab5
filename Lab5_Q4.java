import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab5_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first x value: ");
		double x1 = scan.nextDouble();
		System.out.println("Enter the first y value: ");
		double y1 = scan.nextDouble();
		System.out.println("Enter the second x value: ");
		double x2 = scan.nextDouble();
		System.out.println("Enter the second y value: ");
		double y2 = scan.nextDouble();
		
		DecimalFormat f1 = new DecimalFormat(".##");
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println(distance);
		System.out.println("The distance between points [" + x1 + ", " + y1 + "] and [" + x2 + ", " + y2 + "] is " + f1.format(distance));
	}

}
