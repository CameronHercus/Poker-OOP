package Main;

public class FlushAnalyser extends HandAnalyser {

    HandRank analyseHand(Hand playerHand) {
        if (playerHand.getPokerSuitSet().size() == 1) {
            return new FlushRank();
        }
        return null;
    }
}
