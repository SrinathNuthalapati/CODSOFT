import java.util.Scanner;

public class Task1NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int range = 100;
        int randomNumber = (int) (Math.random() * range) + 1;
        int attempts = 0;
        int maxAttempts = 10;
        boolean guessedCorrectly = false;

        System.out.println("Guess the number between 1 and " + range + "! You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                guessedCorrectly = true;
                break;
            } else if (userGuess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry! You've used all attempts. The number was: " + randomNumber);
        }
    }
}
