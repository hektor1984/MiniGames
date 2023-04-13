package games.lotto;

import java.util.Arrays;
import java.util.TreeSet;

class InputModelForTest implements InputModel {
    private final TreeSet<Integer> testTreeset = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));

    @Override
    public TreeSet<Integer> reciveInput() {
        return testTreeset;
    }
}
