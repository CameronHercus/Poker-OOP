package Main;

public class FourOfAKindAnalyser extends HandAnalyser {
    //mayb implement the checkrank duplicates func
    HandRank analyseHand(Hand playerHand) {
        for (int i = 0; i < 2; i++) {
            if (checkRankDuplicates(4, playerHand.getPokerHandList().get(i), playerHand)) {
                return new FourOfAKindRank();
            }
        }
        return null;
    }
}
