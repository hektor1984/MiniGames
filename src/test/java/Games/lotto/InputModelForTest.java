package Games.lotto;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

 class InputModelForTest implements InputModel {
    @Override
    public TreeSet<Integer> reciveInput() {
        TreeSet<Integer> testTreeset = new TreeSet<>(Arrays.asList(1,2,3,4,5,6));
        return testTreeset;

    }
}
