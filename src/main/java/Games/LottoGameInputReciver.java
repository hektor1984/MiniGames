package Games;

import lombok.Data;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Data
public class LottoGameInputReciver {

    private TreeSet<Integer> inputNumbers = new TreeSet<>();
    private  Scanner scanner = new Scanner(System.in);

    public TreeSet<Integer> userInput(Scanner sc) {
        this.scanner = sc;

        int i = 1;
        System.out.println("Podaj 6 liczb z zakresu 1-99:");


        do {
            try {
                System.out.println("Liczba numer: " + i);
                String inputLine = scanner.nextLine();
                int parsedLine = Integer.parseInt(inputLine);

                Pattern pattern = Pattern.compile("^[1-9][0-9]*$");
                Matcher matcher = pattern.matcher(inputLine);

                if (inputNumbers.contains(parsedLine)) {
                    System.out.println("Tą liczbę już podałeś - podaj inną liczbę !!");
                } else if (matcher.find() && parsedLine > 0 && parsedLine < 100) {
                    inputNumbers.add(parsedLine);
                    i++;
                } else {
                    System.out.println("Wprowadzono błędną wartość - podaj prawidłową liczbę !!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wprowadzono błędny znak");
            }
        } while (i < 7);
        return inputNumbers;

    }


    public void printInput(TreeSet<Integer> treeSet) {
        this.inputNumbers = treeSet;
        System.out.println("Oto Twoje liczby: " + treeSet);
    }
}
