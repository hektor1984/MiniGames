package games.lotto;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

class InputModelFromUserTest {


    @Test
    void should_return_correct_given_treeset_even_when_incorrect_input_is_entered() {
        //given
        TreeSet<Integer> givenTreeset = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Scanner scanner = Mockito.mock(Scanner.class);
        doReturn("1", "1d", "-90", "100", "2", "3", "a", "4", "4", "5", "6").when(scanner).nextLine();
        InputModelFromUser inputModelFromUser = new InputModelFromUser(scanner);
        //when
        TreeSet<Integer> resultTreeset = inputModelFromUser.reciveInput();
        //then
        assertEquals(givenTreeset, resultTreeset);
    }
}