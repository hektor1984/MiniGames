package Games.lotto;

import java.util.TreeSet;

import static Games.lotto.LottoConfiguration.LOSE_MESSAGE;
import static Games.lotto.LottoConfiguration.WIN_MESSAGE;

class ResultAnnouncer {
    void finalResult(TreeSet <Integer> resultTreeset) {
        if (resultTreeset.size() > 2) {
            System.out.println(WIN_MESSAGE + resultTreeset.size());
        } else {
            System.out.println(LOSE_MESSAGE + resultTreeset.size());
        }
    }
}
