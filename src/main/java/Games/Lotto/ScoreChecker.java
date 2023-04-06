package Games.Lotto;

import java.util.TreeSet;

class ScoreChecker {
private final NumberDrawer numberDrawer;
    private int score;

    ScoreChecker(NumberDrawer numberDrawer) {
        this.numberDrawer = numberDrawer;
    }

    public int checkGameScore(TreeSet<Integer> numberList) {
        for (Integer integer : numberList) {
            if (numberList.contains(integer)) {
                score++;
            }
        }
        return score;
    }
}
