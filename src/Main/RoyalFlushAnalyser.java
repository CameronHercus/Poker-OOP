package Main;

public class RoyalFlushAnalyser extends HandAnalyser {

    HandRank analyseHand(Hand playerHand) {
        if (playerHand.getPokerSuitSet().size() == 1) {
            for (int i = 10; i < 15; i++) {
                if (!playerHand.getPokerCardRankSet().contains(i)) {
                    return null;
                }
            }
            return new RoyalFlushRank();
        }
        return null;
    }
}
