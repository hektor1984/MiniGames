package games.lotto;

import java.util.TreeSet;

import static games.lotto.LottoMessageProvider.LOSE_MESSAGE;
import static games.lotto.LottoMessageProvider.WIN_MESSAGE;

class ResultAnnouncer {
    void finalResult(TreeSet <Integer> resultTreeset) {
        if (resultTreeset.size() > 2) {
            System.out.println(WIN_MESSAGE + resultTreeset.size());
        } else {
            System.out.println(LOSE_MESSAGE + resultTreeset.size());
        }
    }
}
