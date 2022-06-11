import java.util.*;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int myNumber = (int)(Math.random() * 100);
        int guessedNumber = 0;

        do {
            System.out.print("Guess a Number (from 1 to 100): ");
            guessedNumber = scanner.nextInt();

            if (myNumber == guessedNumber) {
                System.out.println("YOU GOT IT RIGHT......");
                break;
            }
            else if (myNumber > guessedNumber) {
                System.out.println("Guess a bigger number.");
            }
            else if (myNumber < guessedNumber) {
                System.out.println("Guess a smaller number.");
            }
        }
        while (guessedNumber >= 0); {
            System.out.println("The number was: " + myNumber);
        }
        scanner.close();
    }
}
