package games.lotto;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.TreeSet;

import static games.lotto.LottoMessageProvider.RANDOM_NUMBER_DRAWN_MSG;
import static org.junit.jupiter.api.Assertions.*;

class NumberPrinterTest {
    @Test
    void should_print_drawn_numbers() {
        //given
        NumberPrinter numberPrinter = new NumberPrinter();
        TreeSet<Integer> drawnNumbersTreeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        String winningString = RANDOM_NUMBER_DRAWN_MSG + drawnNumbersTreeSet;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        //when
        numberPrinter.printDrawnNumbers(drawnNumbersTreeSet);
        //then
        assertEquals(winningString, outputStreamCaptor.toString().trim());
    }
}