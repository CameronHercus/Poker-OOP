package Main;

public class PairAnalyser extends HandAnalyser {
    HandRank analyseHand(Hand playerHand) {
        for (int i = 0; i < 4; i++) {
            if (checkRankDuplicates(2, playerHand.getPokerHandList().get(i), playerHand)) {
                return new PairRank();
            }
        }
        return  null;
    }
}
