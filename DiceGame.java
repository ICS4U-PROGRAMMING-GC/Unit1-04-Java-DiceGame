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
        // Setup scanner and random generator
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game variables
        int target = random.nextInt(6) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess a number between 1 and 6!");

        // Main game loop
        while (guess != target) {
            System.out.print("Enter a number: ");

            // Validate number input
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next();
                continue;
            }

            // Read guess and count attempt
            guess = scanner.nextInt();
            attempts++;

            // Hints
            if (guess > target) {
                System.out.println("Too high!");
            } else if (guess < target) {
                System.out.println("Too low!");
            }
        }

        //if guessed correctly 
        System.out.println("Correct! Total guesses: "
            + attempts);

        scanner.close();
    }
}
