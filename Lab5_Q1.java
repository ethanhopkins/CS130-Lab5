import java.text.NumberFormat;

public class Lab5_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double oil = 2.99;
		NumberFormat f1 = NumberFormat.getCurrencyInstance();
		System.out.println("The oil price in Kentucky is " + f1.format(oil));
		
		NumberFormat f2 = NumberFormat.getPercentInstance();
		System.out.println("The oil price increased by " + f2.format(10) + " last year");
	}

}
