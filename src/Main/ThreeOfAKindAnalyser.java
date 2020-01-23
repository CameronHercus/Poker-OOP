package Main;

public class ThreeOfAKindAnalyser extends HandAnalyser {
    HandRank analyseHand(Hand playerHand) {
        for (int i = 0; i < 3; i++) {
            if (checkRankDuplicates(3, playerHand.getPokerHandList().get(i), playerHand)) {
                return new ThreeOfAKindRank();
            }
        }
        return  null;
    }
}
