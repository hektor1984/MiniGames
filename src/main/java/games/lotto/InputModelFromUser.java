package games.lotto;

import lombok.Data;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static games.lotto.LottoConfiguration.NUMBERS_TO_DRAW;
import static games.lotto.LottoConfiguration.RANGE_OF_DRAWN_MAX;
import static games.lotto.LottoConfiguration.RANGE_OF_DRAWN_MIN;
import static games.lotto.LottoMessageProvider.COUNT_NUMBER_MSG;
import static games.lotto.LottoMessageProvider.GIVE_X_NUMBERS_FROM_RANGE;
import static games.lotto.LottoMessageProvider.REPETED_NUMBER_MSG;
import static games.lotto.LottoMessageProvider.WRONG_SIGN_MSG;
import static games.lotto.LottoMessageProvider.WRONG_VALUE_MSG;

@Data
class InputModelFromUser implements InputModel {

    private final Scanner sc;
    private TreeSet<Integer> inputNumbers = new TreeSet<>();

    @Override
    public TreeSet<Integer> reciveInput() {
        int numberCounter = 1;
        System.out.println(GIVE_X_NUMBERS_FROM_RANGE);
        do {
            try {
                System.out.println(COUNT_NUMBER_MSG + numberCounter);
                String inputLine = sc.nextLine();
                int parsedLine = Integer.parseInt(inputLine);
                Pattern pattern = Pattern.compile("^[1-9][0-9]*$");
                Matcher matcher = pattern.matcher(inputLine);
                if (inputNumbers.contains(parsedLine)) {
                    System.out.println(REPETED_NUMBER_MSG);
                } else if (matcher.find() && parsedLine >= RANGE_OF_DRAWN_MIN && parsedLine < RANGE_OF_DRAWN_MAX) {
                    inputNumbers.add(parsedLine);
                    numberCounter++;
                } else {
                    System.out.println(WRONG_VALUE_MSG);
                }
            } catch (NumberFormatException e) {
                System.out.println(WRONG_SIGN_MSG);
            }
        } while (numberCounter <= NUMBERS_TO_DRAW);
        return inputNumbers;
    }
}
