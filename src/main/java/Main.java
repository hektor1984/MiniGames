import Games.lotto.LottoGameStarter;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Menu menu = new Menu(new Scanner(System.in));
        menu.chosenGame();
        LottoGameStarter lottoGameStarter = new LottoGameStarter();
        lottoGameStarter.start();

    }
}
