enum Day {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class Lab5_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d1 = Day.Monday;
		Day d2 = Day.Tuesday;
		Day d3 = Day.Wednesday;
		Day d4 = Day.Thursday;
		Day d5 = Day.Friday;
		Day d6 = Day.Saturday;
		Day d7 = Day.Sunday;
		
		System.out.println(d1 + " " + d1.ordinal());
		System.out.println(d2 + " " + d2.ordinal());
		System.out.println(d3 + " " + d3.ordinal());
		System.out.println(d4 + " " + d4.ordinal());
		System.out.println(d5 + " " + d5.ordinal());
		System.out.println(d6 + " " + d6.ordinal());
		System.out.println(d7 + " " + d7.ordinal());
	}

}
