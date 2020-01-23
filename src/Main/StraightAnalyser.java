package Main;

public class StraightAnalyser extends HandAnalyser {

    HandRank analyseHand(Hand playerHand) {
        int lowest = getLowestRank(playerHand);
        for (int i = 1; i < 5; i++) {
            if (!playerHand.getPokerCardRankSet().contains(lowest + i)) {
                return null;
            }
        }
        return new StraightRank();
    }
}
