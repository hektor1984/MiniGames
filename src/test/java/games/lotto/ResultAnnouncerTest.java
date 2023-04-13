package games.lotto;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.TreeSet;

import static games.lotto.LottoMessageProvider.LOSE_MESSAGE;
import static games.lotto.LottoMessageProvider.WIN_MESSAGE;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ResultAnnouncerTest {

    @Test
    void should_return_winning_message() {
        //given
        InputModelForTest inputModelForTest = new InputModelForTest();
        NumberDrawer numberDrawer = mock(NumberDrawer.class);
        doReturn(new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6))).when(numberDrawer).drawingNumbers();
        ResultAnnouncer resultAnnouncer = new ResultAnnouncer();
        TreeSet<Integer> lottoRandomNumbers = numberDrawer.drawingNumbers();
        TreeSet<Integer> userNumbers = inputModelForTest.reciveInput();
        lottoRandomNumbers.retainAll(userNumbers);
        String winningMessage = WIN_MESSAGE + lottoRandomNumbers.size();
        //when
        String result = resultAnnouncer.finalResult(lottoRandomNumbers);
        //then
        assertEquals(winningMessage, result);
    }
        @Test
        void should_return_losing_message() {
            //given
            InputModelForTest inputModelForTest = new InputModelForTest();
            NumberDrawer numberDrawer = mock(NumberDrawer.class);
            when(numberDrawer.drawingNumbers()).thenReturn(new TreeSet<>(Arrays.asList(1, 2, 7, 8, 9, 10)));
            ResultAnnouncer resultAnnouncer = new ResultAnnouncer();
            TreeSet<Integer> lottoRandomNumbers = numberDrawer.drawingNumbers();
            TreeSet<Integer> userNumbers = inputModelForTest.reciveInput();
            lottoRandomNumbers.retainAll(userNumbers);
            String loseingMessage = LOSE_MESSAGE + lottoRandomNumbers.size();
            //when
            String result = resultAnnouncer.finalResult(lottoRandomNumbers);
            //then
            assertEquals(loseingMessage, result);
        }
    }