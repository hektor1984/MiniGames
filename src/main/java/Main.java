import games.lotto.LottoGameStarter;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Menu menu = new Menu(new Scanner(System.in), new LottoGameStarter());
        menu.chosenGame();
          }
}
