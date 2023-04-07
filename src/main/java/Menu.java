import java.util.Scanner;

class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
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
            case '1' -> System.out.println("LOTTO");
            default -> System.exit(0);
        }
    }
}