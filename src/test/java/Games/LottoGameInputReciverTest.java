package Games;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class LottoGameInputReciverTest {
    private LottoGameInputReciver lottoGameInputReciver;

    @BeforeEach
    void init() {
        lottoGameInputReciver = new LottoGameInputReciver();
    }

    @Test
    void should_return_given_treeSet() {
        //given
        TreeSet<Integer> arrayList = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Scanner scanner = Mockito.mock(Scanner.class);
        doReturn("1", "2", "3", "4", "5", "6").when(scanner).nextLine();
        //when
        TreeSet<Integer> result = lottoGameInputReciver.userInput(scanner);
        //then
        assertEquals(arrayList, result);
    }

    @Test
    void should_return_correct_given_arrayList_even_when_incorrect_input_is_entered() {
        //given
        TreeSet<Integer> arrayList = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Scanner scanner = Mockito.mock(Scanner.class);
        doReturn("1", "1d", "-90", "100", "2", "3", "a", "4", "4", "5", "6").when(scanner).nextLine();
        //when
        TreeSet<Integer> result = lottoGameInputReciver.userInput(scanner);
        //then
        assertEquals(arrayList, result);
    }

    @Test
    void should_throw_NumberFormatException_when_not_a_number_is_given() {
        //then
        assertThrows(NumberFormatException.class, () -> Integer.parseInt("a"));
    }

    @Test
    void verify_calling_printInput_method() {
        //given
        LottoGameInputReciver lottoGameInputReciver = mock(LottoGameInputReciver.class);
        TreeSet<Integer> treeSet = new TreeSet<>();
        //when
        lottoGameInputReciver.printInput(treeSet);
        //then
        verify(lottoGameInputReciver, times(1)).printInput(treeSet);
    }

    @Test
    void should_print_correct_message_with_sorted_input_treeSet() {
        //given
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(70, 60, 50, 40, 30, 20));
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String outputString = "Oto Twoje liczby: " + treeSet;
        //when
        lottoGameInputReciver.printInput(treeSet);
        //then
        assertEquals(outputString, outputStreamCaptor.toString().trim());
    }


}