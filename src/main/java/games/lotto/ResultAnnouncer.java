package games.lotto;

import java.util.TreeSet;

import static games.lotto.LottoMessageProvider.LOSE_MESSAGE;
import static games.lotto.LottoMessageProvider.WIN_MESSAGE;

class ResultAnnouncer {
    String finalResult(TreeSet<Integer> resultTreeset) {
        String resultMessage;
        if (resultTreeset.size() < 3) {
            resultMessage = LOSE_MESSAGE + resultTreeset.size();
        } else {
            resultMessage = WIN_MESSAGE + resultTreeset.size();
        }
        return resultMessage;
    }
}
