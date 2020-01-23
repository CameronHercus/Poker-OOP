package Main;

public abstract class HandAnalyser {

    //  make this abstract just use it to test atm
    public boolean checkRankDuplicates(int numSameRank, Card playerCard, Hand playerHand) {
        int counter = 0;
        for (Card i: playerHand.getPokerHandList()) {
            if (i.getRank() == playerCard.getRank()) {
                counter += 1;
            }
        }
        if (counter == numSameRank) {
            return true;
        }
        return false;
    }

    public int getLowestRank(Hand PlayerHand) {
        int lowest = Integer.MAX_VALUE;
        for (Integer i: PlayerHand.getPokerCardRankSet()) {
            if (i < lowest) {
                lowest = i;
            }
        }
        return lowest;
    }

    abstract HandRank analyseHand(Hand playerHand);
}
