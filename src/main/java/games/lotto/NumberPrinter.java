package games.lotto;

import java.util.TreeSet;

import static games.lotto.LottoMessageProvider.RANDOM_NUMBER_DRAWN_MSG;

class NumberPrinter {

    void printDrawnNumbers(TreeSet<Integer> drawnTreeset) {
        System.out.println(RANDOM_NUMBER_DRAWN_MSG + drawnTreeset);
    }
}
