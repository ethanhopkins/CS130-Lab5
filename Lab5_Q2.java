import java.util.Random;

public class Lab5_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int randNum = generator.nextInt(16) + 5;
		System.out.println(randNum);
	}

}
