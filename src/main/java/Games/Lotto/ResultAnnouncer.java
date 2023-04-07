package Games.Lotto;

import java.util.TreeSet;

import static Games.Lotto.LottoConfiguration.LOSE_MESSAGE;
import static Games.Lotto.LottoConfiguration.WIN_MESSAGE;

public class ResultAnnouncer {
    public void finalResult(TreeSet <Integer> resultTreeset) {
        if (resultTreeset.size() > 2) {
            System.out.println(WIN_MESSAGE + resultTreeset.size());
        } else {
            System.out.println(LOSE_MESSAGE + resultTreeset.size());
        }
    }
}
