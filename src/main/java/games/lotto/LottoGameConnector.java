package games.lotto;

import java.util.TreeSet;

class LottoGameConnector {
    private final InputModelFromUser inputModelFromUser;
    private final InputPrinter inputPrinter;
    private final NumberDrawer numberDrawer;
    private final NumberPrinter numberPrinter;
    private final ResultAnnouncer resultAnnouncer;

    LottoGameConnector(InputModelFromUser inputModelFromUser, InputPrinter inputPrinter, NumberDrawer numberDrawer,
                       NumberPrinter numberPrinter, ResultAnnouncer resultAnnouncer) {
        this.inputModelFromUser = inputModelFromUser;
        this.inputPrinter = inputPrinter;
        this.numberDrawer = numberDrawer;
        this.numberPrinter = numberPrinter;
        this.resultAnnouncer = resultAnnouncer;
    }

    void startConnector() {
        TreeSet<Integer> lottoRandomNumbers;
        TreeSet<Integer> userNumbers;

        inputModelFromUser.reciveInput();
        userNumbers = inputModelFromUser.getInputNumbers();
        inputPrinter.printInput(userNumbers);
        lottoRandomNumbers = numberDrawer.drawingNumbers();
        numberPrinter.printDrawnNumbers(lottoRandomNumbers);
        lottoRandomNumbers.retainAll(userNumbers);
        System.out.println(resultAnnouncer.finalResult(lottoRandomNumbers));
    }
}
