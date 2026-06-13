import java.util.Random;
import java.util.Scanner;

public class Numbergame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int score = 0;
        char playAgain;

        do {
            int number = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;

            System.out.println("\n=== NUMBER GAME ===");
            System.out.println("Guess a number between 1 and 100");

            do {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too High!");
                } else if (guess < number) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Attempts: " + attempts);

                    int roundScore = 100 - (attempts - 1) * 10;
                    if (roundScore < 0) {
                        roundScore = 0;
                    }

                    score += roundScore;
                    System.out.println("Round Score: " + roundScore);
                    System.out.println("Total Score: " + score);
                }

            } while (guess != number);

            System.out.print("Play Again? (Y/N): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'Y' || playAgain == 'y');

        System.out.println("Thanks for playing!");
        System.out.println("Final Score: " + score);

        sc.close();
    }
}
