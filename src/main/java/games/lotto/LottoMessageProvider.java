package games.lotto;

import static games.lotto.LottoConfiguration.GAME_LOW_BOUND;
import static games.lotto.LottoConfiguration.GAME_MAX_BOUND;
import static games.lotto.LottoConfiguration.NUMBERS_TO_DRAW;

class LottoMessageProvider {

    static final String WIN_MESSAGE = "BRAWO!! Wygrałeś. Tyle liczb trafiłeś: ";
    static final String LOSE_MESSAGE = "Niestety nie wygrałeś. Tyle liczb trafiłeś: ";
    static final String REPETED_NUMBER_MSG = "Tą liczbę już podałeś - podaj inną liczbę !!";
    static final String WRONG_VALUE_MSG = "Wprowadzono błędną wartość - podaj prawidłową liczbę !!";
    static final String WRONG_SIGN_MSG = "Wprowadzono błędny znak";
    static final String USER_NUMBERS_MSG = "Oto Twoje liczby: ";
    static final String RANDOM_NUMBER_DRAWN_MSG = "Liczby wylosowane przez komputer: ";
    static final String GIVE_X_NUMBERS_FROM_RANGE = "Podaj " + NUMBERS_TO_DRAW + " liczb z zakresu "
            + GAME_LOW_BOUND + "-" + GAME_MAX_BOUND + ":";
    static final String COUNT_NUMBER_MSG = "Liczba numer: ";
}
