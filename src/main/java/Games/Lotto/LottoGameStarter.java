package Games.Lotto;

import java.util.TreeSet;

public class LottoGameStarter {
    private final InputReciver inputReciver;
    private final InputPrinter inputPrinter;
    private final NumberDrawer numberDrawer;
    private final NumberPrinter numberPrinter;

    private final ResultAnnouncer resultAnnouncer;

    public LottoGameStarter(InputReciver inputReciver, InputPrinter inputPrinter, NumberDrawer numberDrawer,
                            NumberPrinter numberPrinter,  ResultAnnouncer resultAnnouncer) {
        this.inputReciver = inputReciver;
        this.inputPrinter = inputPrinter;
        this.numberDrawer = numberDrawer;
        this.numberPrinter = numberPrinter;
        this.resultAnnouncer = resultAnnouncer;
    }


    public void start() {
        TreeSet <Integer> lottoRandomNumbers = numberDrawer.drawingNumbers();
      ;

        inputReciver.reciveInput();
        inputPrinter.printInput(inputReciver.getInputNumbers());
        numberPrinter.printDrawnNumbers(lottoRandomNumbers);
        lottoRandomNumbers.retainAll(inputReciver.getInputNumbers());
        resultAnnouncer.finalResult(lottoRandomNumbers);


    }


}
