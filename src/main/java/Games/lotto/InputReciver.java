package Games.lotto;

import lombok.Data;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Games.lotto.LottoConfiguration.NUMBERS_TO_DRAW;
import static Games.lotto.LottoConfiguration.RANGE_OF_DRAWN_MAX;
import static Games.lotto.LottoConfiguration.RANGE_OF_DRAWN_MIN;

@Data
class InputReciver implements InputModel{

    private final Scanner sc;

    private TreeSet<Integer> inputNumbers = new TreeSet<>();
    @Override
    public TreeSet<Integer> reciveInput() {
        int numberCounter = 1;
        System.out.println("Podaj " + NUMBERS_TO_DRAW + " liczb z zakresu 1-99:");
        do {
            try {
                System.out.println("Liczba numer: " + numberCounter);
                String inputLine = sc.nextLine();
                int parsedLine = Integer.parseInt(inputLine);
                Pattern pattern = Pattern.compile("^[1-9][0-9]*$");
                Matcher matcher = pattern.matcher(inputLine);
                if (inputNumbers.contains(parsedLine)) {
                    System.out.println("Tą liczbę już podałeś - podaj inną liczbę !!");
                } else if (matcher.find() && parsedLine >= RANGE_OF_DRAWN_MIN && parsedLine < RANGE_OF_DRAWN_MAX) {
                    inputNumbers.add(parsedLine);
                    numberCounter++;
                } else {
                    System.out.println("Wprowadzono błędną wartość - podaj prawidłową liczbę !!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono błędny znak");
            }
        } while (numberCounter <= NUMBERS_TO_DRAW);
        return inputNumbers;
    }
}
