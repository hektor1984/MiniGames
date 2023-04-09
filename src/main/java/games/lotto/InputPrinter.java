package games.lotto;

import java.util.TreeSet;

import static games.lotto.LottoMessageProvider.USER_NUMBERS_MSG;

class InputPrinter {



     void printInput(TreeSet<Integer> treeSet) {
        System.out.println(USER_NUMBERS_MSG + treeSet);
    }
}
