package Games.Lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

class LottoGameResultTest {

    private LottoGameResult lottoGameResult;

    @BeforeEach
    void init() {
        lottoGameResult = new LottoGameResult();
    }

    @Test
    void should_return_correct_score_when_compared_two_number_list() {
        //given
        TreeSet<Integer> drawnNumbers = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        TreeSet<Integer> numberList = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        lottoGameResult.setDrawnNumbers(drawnNumbers);
        //when
        int result = lottoGameResult.checkGameScore(numberList);
        //then
        assertEquals(6, result);
    }

    @Test
    void should_print_winning_message() {
        //given
        int score = 5;
        String winningString = "BRAWO!! Wygrałeś. Tyle liczb trafiłeś: " + score;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        //when
        lottoGameResult.finalResult(score);
        //then
        assertEquals(winningString, outputStreamCaptor.toString().trim());
    }

    @Test
    void should_print_losing_message() {
        //given
        int score = 2;
        String losingString = "Niestety nie wygrałeś. Tyle liczb trafiłeś: " + score;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        //when
        lottoGameResult.finalResult(score);
        //then
        assertEquals(losingString, outputStreamCaptor.toString().trim());
    }


    @Test
    void should_return_treeSet_filled_with_six_numbers_when_empty_was_given() {
        //given
        TreeSet<Integer> drawnNumbers = new TreeSet<>();
        //when
        lottoGameResult.drawingNumbers(drawnNumbers);
        //then
        assertEquals(6, drawnNumbers.size());

    }

    @Test
    void should_return_treeSet_filled_with_six_numbers_when_number_was_drawn_two_times() {
        //given
        TreeSet<Integer> drawnNumbers = new TreeSet<>();
        Random rand = mock(Random.class);
        doReturn(1, 1, 2, 3, 4, 5, 6).when(rand).nextInt();
        //when
        lottoGameResult.drawingNumbers(drawnNumbers);
        //then
        assertEquals(6, drawnNumbers.size());

    }

    @Test
    void should_return_message_with_drawn_numbers() {
        //given
        TreeSet<Integer> drawnNumbers = new TreeSet<>(Arrays.asList(7, 6, 5, 4, 3, 2));
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String outputString = "Liczby wylosowane przez komputer: " + drawnNumbers;
        //when
        lottoGameResult.printDrawnNumbers(drawnNumbers);
        //then
        assertEquals(outputString, outputStreamCaptor.toString().trim());
    }

}