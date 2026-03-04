import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private final GameConfiguration config;

    public Game(GameConfiguration config){
        this.config = config;
    }

    boolean returnGame = false;

    public void checkWin(int a, int b, int c) {
        if (a == b) {
            System.out.println("You guessed correctly in " + c + " rounds!");
            returnGame = true;

        } else if (a < b) {
            System.out.println("You guessed too low! Try guessing higher");

        } else if (a > b) {
            System.out.println("You guessed too high! Try guessing lower");

        }
    }

    public static void loseMessage (int a, int b) {
        if (a == 5) {
            System.out.println("");
            System.out.println("you failed to guess correctly in 5 rounds! The random number was: " + b);
        }
    }

    public void runGame() {

        List<Integer> ascendingNumbers = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            ascendingNumbers.add(i);
        }

        Random r = new Random();
        int randomNumber = ascendingNumbers.get(r.nextInt(ascendingNumbers.size()));

        for (int j = 1; j <= 5; j++) {

            int roundCount = j;
            System.out.println("");
            System.out.println(randomNumber);
            System.out.println("Round count: " + j);

            Scanner scannerInput = new Scanner(System.in);

            System.out.print("Try and guess a number between 0 and 50: ");
            int guessNumber = scannerInput.nextInt();

            checkWin(guessNumber, randomNumber, roundCount);

            loseMessage(roundCount, randomNumber);

            scannerInput.reset();
        }

    }

}
