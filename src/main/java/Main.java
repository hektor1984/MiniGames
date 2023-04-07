import Games.Lotto.InputPrinter;
import Games.Lotto.InputReciver;
import Games.Lotto.LottoGameStarter;
import Games.Lotto.NumberDrawer;
import Games.Lotto.NumberPrinter;
import Games.Lotto.ResultAnnouncer;

import java.util.Scanner;

public class Main {
    public static void main(String[] Args) {
        Menu menu = new Menu(new Scanner(System.in));
        menu.chosenGame();
        LottoGameStarter lottoGameStarter = new LottoGameStarter(
                new InputReciver(new Scanner(System.in)), new InputPrinter(),
                new NumberDrawer(), new NumberPrinter(), new ResultAnnouncer());
        lottoGameStarter.start();
    }
}
