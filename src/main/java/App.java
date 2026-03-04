public class App {

    public static void main(String[] args) {

        GameConfiguration config = new GameConfiguration();
        Game game = new Game(config);
        game.runGame();

    }

}
