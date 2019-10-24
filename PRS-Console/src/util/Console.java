package util;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);

	// Should not allow an empty string
	public static String getStringNoEmpty(String prompt) {
		String s = null;
		boolean isValid = false;
		while (!isValid) {

			System.out.print(prompt);
			s = sc.nextLine(); // read user entry
			if (s != null && !s.equals("")) {
				System.out.println("entry required");
			} else {
				isValid = true;
			}
		}
		return s;
	}

	// doesn't check for empty string
	public static String getString(String prompt) {
		System.out.print(prompt);
		// String s = sc.nextLine();
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	// Doesn't need min/max
	public static int getInt(String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getIntMinMax(String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getIntMinMax(prompt, min, max);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}

	public static double getDouble(String prompt) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid number. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (d >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return d;
	}

	public static String getContinue(String prompt) {
		// private static String getContinue(Scanner sc, String prompt) {
		String s = "";
		boolean isValid = false;
		// keep prompting until user enters y or n
		while (!isValid) {
			System.out.println(prompt);
			s = sc.nextLine();
			// check for empty string
			if (s.equalsIgnoreCase("")) {
				System.out.println("Error... entry is required");
				continue;
			} else if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
				isValid = true;
			} else {
				System.out.println("Error... only 'y' or 'n' is accepted.");
				continue;
			}
		}
		return s;
	}

}
