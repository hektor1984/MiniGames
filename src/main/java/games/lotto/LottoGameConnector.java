package games.lotto;

import java.util.TreeSet;

class LottoGameConnector {
    private final InputModelFromUser inputReciver;
    private final InputPrinter inputPrinter;
    private final NumberDrawer numberDrawer;
    private final NumberPrinter numberPrinter;
    private final ResultAnnouncer resultAnnouncer;

    LottoGameConnector(InputModelFromUser inputModelFromUser, InputPrinter inputPrinter, NumberDrawer numberDrawer,
                       NumberPrinter numberPrinter, ResultAnnouncer resultAnnouncer) {
        this.inputReciver = inputModelFromUser;
        this.inputPrinter = inputPrinter;
        this.numberDrawer = numberDrawer;
        this.numberPrinter = numberPrinter;
        this.resultAnnouncer = resultAnnouncer;
    }
    void startConnector() {
        TreeSet<Integer> lottoRandomNumbers = numberDrawer.drawingNumbers();
        TreeSet<Integer> userNumbers = inputReciver.getInputNumbers();

        inputReciver.reciveInput();
        inputPrinter.printInput(userNumbers);
        numberPrinter.printDrawnNumbers(lottoRandomNumbers);
        lottoRandomNumbers.retainAll(userNumbers);
        resultAnnouncer.finalResult(lottoRandomNumbers);
    }
}
