package Main;

import java.util.*;

public class Hand {
    private Set<Card> pokerHandSet = new HashSet<Card>();
    private Set<Suit> pokerSuitSet = new HashSet<Suit>();
    private Set<Integer> pokerCardRankSet = new HashSet<Integer>();
    private List<Card> pokerHandList = new ArrayList<Card>();

    public Hand() {
    }

    public void addCard(Card playersCard) {
        pokerHandSet.add(playersCard);
        pokerSuitSet.add(playersCard.getSuit());
        pokerCardRankSet.add(playersCard.getRank());
        pokerHandList.add(playersCard);
    }

    public Set<Suit> getPokerSuitSet() {
        return pokerSuitSet;
    }

    public Set<Card> getPokerHandSet() {
        return pokerHandSet;
    }

    public Set<Integer> getPokerCardRankSet() {
        return pokerCardRankSet;
    }

    public List<Card> getPokerHandList() {
        return pokerHandList;
    }


}
