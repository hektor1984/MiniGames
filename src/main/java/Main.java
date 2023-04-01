import Games.LottoGameResult;
import Games.LottoGameInputReciver;

import java.util.Scanner;

class Main {
    public static void main(String[] Args) {

        Menu menu = new Menu();
        LottoGameInputReciver lottoGameInputReciver = new LottoGameInputReciver();
        LottoGameResult lottoGameResult = new LottoGameResult();
        Scanner scanner = new Scanner(System.in);

        menu.chosenGame();

        lottoGameInputReciver.userInput(scanner);
        lottoGameInputReciver.printInput(lottoGameInputReciver.getInputNumbers());

        lottoGameResult.drawingNumbers(lottoGameResult.getDrawnNumbers());
        lottoGameResult.printDrawnNumbers(lottoGameResult.getDrawnNumbers());
        lottoGameResult.checkGameScore(lottoGameInputReciver.getInputNumbers());
        lottoGameResult.finalResult(lottoGameResult.getScore());
    }
}
