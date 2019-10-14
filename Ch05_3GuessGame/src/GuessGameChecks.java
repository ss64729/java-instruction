import java.util.Scanner;

public class GuessGameChecks {

	public static void main(String[] args) {
		// original
		final int LIMIT = 100;

		displayWelcome(LIMIT);
		int number = getRandomInt(LIMIT);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int count = 1;
			while (true) {
				System.out.print("Your guess: ");
				int guess = sc.nextInt();

				if (guess < 1 || guess > LIMIT) {
					System.out.println("Invalid guess. Try again.");
					continue;
				}

				if (guess < number) {
					System.out.println("Too low.");
				} else if (guess > number) {
					System.out.println("Too high.");
				} else {
					printFinish(count);
					System.out.println("You guessed it in " + count + " tries.\n");
					break;
				}
				count++;
			}
			System.out.print("another guess? (y/n): ");
			choice = sc.next();
			System.out.println();
			// System.out.println("Bye!");
		}
		System.out.println("Bye!");
	}

	// function displayWelcome
	private static void displayWelcome(int limit) {
		System.out.println("Guess the number!");
		System.out.println("I'm thinking of a number from 1 to " + limit);
		System.out.println();
	}

	// function getRandomInt
	public static int getRandomInt(int limit) {
		double d = Math.random() * limit; // d is >= 0.0 and < limit
		int randomInt = (int) d; // convert double to int
		randomInt++; // int is >= 1 and <= limit
		return randomInt;
	}

	private static void printFinish(int count) {
		if (count <= 3) {
			System.out.println("Great Work Math WIZ!");
		} else if (count > 3 && count <= 7) {
			System.out.println("Not too bad you have potential ");
		} else {
			System.out.println("What took so long?");
		}
	}

}
