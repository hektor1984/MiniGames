package games.lotto;

import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static games.lotto.LottoConfiguration.NUMBERS_TO_DRAW;
import static org.junit.jupiter.api.Assertions.*;

class NumberDrawerTest {

    @Test
    void should_return_treeSet_filled_with_six_numbers_when_empty_was_given() {
        //given
        NumberDrawer numberDrawer = new NumberDrawer();
        //when
        TreeSet<Integer> drawnNumbers = numberDrawer.drawingNumbers();
        //then
        assertEquals(NUMBERS_TO_DRAW, drawnNumbers.size());
    }
}