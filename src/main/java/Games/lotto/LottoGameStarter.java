package Games.lotto;

import java.util.Scanner;

public class LottoGameStarter {

    public void start() {
        LottoGameConnector lottoGameConnector = new LottoGameConnector(
                new InputReciver(new Scanner(System.in)), new InputPrinter(),
                new NumberDrawer(), new NumberPrinter(), new ResultAnnouncer());
        lottoGameConnector.startConnector();
    }
}
