package Main;

public class FullHouseAnalyser extends HandAnalyser {

    HandRank analyseHand(Hand playerHand) {
        if (playerHand.getPokerCardRankSet().size() == 2) {
            return new FullHouseRank();
        }
        return null;
    }
}
