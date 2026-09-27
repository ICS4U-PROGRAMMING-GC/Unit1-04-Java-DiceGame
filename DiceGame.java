import java.util.Random;
import java.util.Scanner;

/**
 * Dice game program that lets user guess a number.
 */
public class DiceGame {

    /**
     * Private constructor to prevent instantiation.
     */
    private DiceGame() {
    }

    /**
     * Main entry point for the program.
     *
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {
        // Setup scanner
        Scanner scanner = new Scanner(System.in);
        // Setup random
        Random random = new Random();

        // Game variables
        int target = random.nextInt(6) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 6!");

        // Main game loop
        while (guess != target) {
            System.out.print("Enter a number: ");

            // Check if input is not an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();

            // Check if guess is out of range
            if (guess < 1 || guess > 6) {
                System.out.println("Invalid input! Must be between 1 and 6.");
                continue;
            }

            // Valid guess made
            attempts++;

            // Hints
            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            }
        }

        // Win message
        System.out.println("Correct guess and Total guesses: "
            + attempts);

        scanner.close();
    }
}
