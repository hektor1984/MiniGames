package Games.Lotto;

import java.util.TreeSet;

class NumberPrinter {
    private final NumberDrawer numberDrawer;

    NumberPrinter(NumberDrawer numberDrawer) {
        this.numberDrawer = numberDrawer;
    }

    public void printDrawnNumbers(TreeSet<Integer> drawnTreeset) {
        System.out.println("Liczby wylosowane przez komputer: " + drawnTreeset);
    }
}
