package Main;

public class TwoPairAnalyser extends HandAnalyser {

    HandRank analyseHand(Hand playerHand) {
        if (playerHand.getPokerCardRankSet().size() == 3) {
            return new TwoPairRank();
        }
        return null;
    }
}
