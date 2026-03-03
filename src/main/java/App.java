import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        List<Integer> ascendingNumbers = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            ascendingNumbers.add(i);
        }

        Random r = new Random();
        int randomNumber = ascendingNumbers.get(r.nextInt(ascendingNumbers.size()));

        for (int j = 1; j <= 5; j++) {

            System.out.println("");
            System.out.println(randomNumber);
            System.out.println("Round count: " + j);

            Scanner scannerInput = new Scanner(System.in);

            System.out.print("Try and guess a number between 0 and 50: ");
            int guessNumber = scannerInput.nextInt();

            if (guessNumber == randomNumber) {
                System.out.println("You guessed correctly in " + j + "rounds!");
                return;
            } else if (guessNumber < randomNumber) {
                System.out.println("You guessed too low! Try guessing higher");

            } else if (guessNumber > randomNumber) {
                System.out.println("You guessed too high! Try guessing lower");

            }

            if (j == 5) {
                System.out.println("");
                System.out.println("you failed to guess correctly in 5 rounds! The random number was: " + randomNumber);
                System.out.println("");
                System.out.println("Do you want to continue? (yes/no): ");
                String nextGameInput = scannerInput.nextLine();

                if (nextGameInput == "yes") {
                    System.out.println("you will play again");
                } else if (nextGameInput == "no") {
                    System.out.println("you don't want to play again");
                } else {
                    System.out.println("invalid response");
                }
            }

            scannerInput.reset();
        }

    }

}
