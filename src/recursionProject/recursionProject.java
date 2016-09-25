package recursionProject;

import java.util.Scanner;

public class recursionProject {
	public static void main(String[] args) {
		System.out.println("Please enter a number:");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		s.nextLine();
		recurseThisNumber(number);

		s.close();
	}

	public static void recurseThisNumber(int number) {
		System.out.println(number);
		if (number > 0) {
			recurseThisNumber(number - 1);
		}
	}
}
