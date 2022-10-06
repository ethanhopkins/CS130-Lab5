import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab5_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length 1: ");
		int l1 = scan.nextInt();
		System.out.println("Enter length 2: ");
		int l2 = scan.nextInt();
		System.out.println("Enter length 3: ");
		int l3 = scan.nextInt();
		
		int perimeter = l1 + l2 + l3;
		int s = perimeter / 2;
		
		DecimalFormat f1 = new DecimalFormat(".##");
		double area = Math.sqrt(s*(s - l1)*(s - l2)*(s - l3));
		System.out.println("The area is: " + area);
		System.out.println("The formatted area is: " + f1.format(area));
	}

}
