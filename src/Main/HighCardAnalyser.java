package Main;

public class HighCardAnalyser extends HandAnalyser {

    HandRank analyseHand(Hand playerHand) {
        return new HighCardRank();
    }
}
