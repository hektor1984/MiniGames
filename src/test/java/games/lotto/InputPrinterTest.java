package games.lotto;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.TreeSet;

import static games.lotto.LottoMessageProvider.USER_NUMBERS_MSG;
import static org.junit.jupiter.api.Assertions.*;

class InputPrinterTest {

    @Test
    void should_print_user_numbers() {
        //given
        InputPrinter inputPrinter = new InputPrinter();
        TreeSet<Integer> userNumbersTreeSet = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        String winningString = USER_NUMBERS_MSG + userNumbersTreeSet;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        //when
        inputPrinter.printInput(userNumbersTreeSet);
        //then
        assertEquals(winningString, outputStreamCaptor.toString().trim());
    }
}