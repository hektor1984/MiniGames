import java.util.Scanner;

class Menu {
    public Menu() {
        System.out.println("WELCOME IN MINIGAMES\n");
        System.out.println("CHOOSE YOUR GAME:\n");
        System.out.println("1. DRAWING NUMBERS - PRESS 1");
        System.out.println("2. QUIT - PRESS Q");
    }
    public void chosenGame() {
        Scanner sc = new Scanner(System.in);
        char scannedChar = sc.next().charAt(0);
        char scannedCharLower = Character.toLowerCase(scannedChar);
        switch (scannedCharLower) {
            case 'q' -> {
                System.out.println("Bye");
                System.exit(0);
            }
            case '1'-> System.out.println("LOTTO");
            default ->  System.exit(0);
        }
        //sc.close();
    }
}