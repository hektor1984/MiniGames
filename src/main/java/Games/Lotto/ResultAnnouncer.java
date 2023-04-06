package Games.Lotto;

class ResultAnnouncer {
    public void finalResult(int score) {
        if (score > 2) {
            System.out.println("BRAWO!! Wygrałeś. Tyle liczb trafiłeś: " + score);
        } else {
            System.out.println("Niestety nie wygrałeś. Tyle liczb trafiłeś: " + score);
        }
    }
}
