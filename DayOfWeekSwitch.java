import java.util.Scanner;

public class DayOfWeekSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int day = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day :");
		day = sc.nextInt();

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wendsday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Input !!!!!!!");
			break;
		}

	}

}
