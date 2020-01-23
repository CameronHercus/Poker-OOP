package Main;

public class StraightFlushAnalyser extends HandAnalyser {

    HandRank analyseHand(Hand playerHand) {
        int lowest = getLowestRank(playerHand);
        if (playerHand.getPokerSuitSet().size() == 1) {
            for (int i = 1; i < 5; i++) {
                if (!playerHand.getPokerCardRankSet().contains(lowest + i)) {
                    return null;
                }
            }
            return new StraightFlushRank();
        }
        return null;
    }
}
