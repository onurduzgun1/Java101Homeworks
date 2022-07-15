package Java101Odevler.BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 10, 120, 100, 50);
        Fighter alex = new Fighter("Alex", 20, 85, 85, 50);

        Match match = new Match(marc, alex, 80, 100);
        match.start();
    }
}
