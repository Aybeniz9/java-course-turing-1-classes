package az.edu.turing;
import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int guess;
        int[] guessNumbers = new int[100];
        System.out.println("Lets the game!");
        System.out.println("Enter the name ");
        String name = scanner.nextLine();
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");

            } else if (guess > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations " + randomNumber + " is correct, bravooo " + name);
            }
        } while (guess != randomNumber);

    }
}
