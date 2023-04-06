package Games.Lotto;

import java.util.Random;
import java.util.TreeSet;

import static Games.Lotto.LottoConfiguration.NUMBERS_TO_DRAW;
import static Games.Lotto.LottoConfiguration.RANGE_OF_DRAWN_MAX;
import static Games.Lotto.LottoConfiguration.RANGE_OF_DRAWN_MIN;


class NumberDrawer {

    public NumberDrawer() {
    }
    public TreeSet<Integer> drawingNumbers(TreeSet<Integer> treeSet) {
        Random rand = new Random();
        while (treeSet.size() < NUMBERS_TO_DRAW) {
            Integer numberDrawn = rand.nextInt(RANGE_OF_DRAWN_MIN, RANGE_OF_DRAWN_MAX);
            treeSet.add(numberDrawn);
        }
        return treeSet;
    }
}
