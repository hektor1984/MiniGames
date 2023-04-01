package Games;

import lombok.Data;

import java.util.*;

/* LOTTO GAME
CHOOSE 6 NUMBERS FROM RANGE 1-99 AND COMPARE THEM TO NUMBERS DRAWN BY COMPUTER
 */
@Data
public class LottoGameResult {
    private TreeSet<Integer> drawnNumbers = new TreeSet<>();
    private int score;

    public TreeSet<Integer> drawingNumbers(TreeSet<Integer> treeSet) {
        this.drawnNumbers=treeSet;
        Random rand = new Random();

        for (int i = 0; i < 6; i++) {
            Integer numberDrawn = rand.nextInt(1, 100);
            if (!treeSet.contains(numberDrawn)) {
                treeSet.add(numberDrawn);
            } else {
                --i;
            }
        }
        return treeSet;
    }

    public void printDrawnNumbers(TreeSet<Integer> treeset) {
        this.drawnNumbers= treeset;
        System.out.println("Liczby wylosowane przez komputer: " + treeset);
    }

    public int checkGameScore(TreeSet<Integer> numberList) {
        for (Integer integer : numberList) {
            if (drawnNumbers.contains(integer)) {
                score++;
            }
        }
        return score;
    }

    public void finalResult(int score) {
        this.score = score;
        if (score > 2) {
            System.out.println("BRAWO!! Wygrałeś. Tyle liczb trafiłeś: " + score);
        } else {
            System.out.println("Niestety nie wygrałeś. Tyle liczb trafiłeś: " + score);
        }
    }
}


