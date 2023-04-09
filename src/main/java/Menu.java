import games.lotto.LottoGameStarter;

import java.util.Scanner;

class Menu {
    private final Scanner scanner;
    private final LottoGameStarter lottoGameStarter;

    public Menu(Scanner scanner, LottoGameStarter lottoGameStarter) {
        this.scanner = scanner;
        this.lottoGameStarter = lottoGameStarter;
        System.out.println("WELCOME IN MINIGAMES\n");
        System.out.println("CHOOSE YOUR GAME:\n");
        System.out.println("1. DRAWING NUMBERS - PRESS 1");
        System.out.println("2. QUIT - PRESS Q");
    }

    public void chosenGame() {

        char scannedChar = scanner.next().charAt(0);
        char scannedCharLower = Character.toLowerCase(scannedChar);
        switch (scannedCharLower) {
            case 'q' -> {
                System.out.println("Bye");
                System.exit(0);
            }
            case '1' -> {
                System.out.println("LOTTO");
                lottoGameStarter.start();
            }

            default -> System.exit(0);
        }
    }
}