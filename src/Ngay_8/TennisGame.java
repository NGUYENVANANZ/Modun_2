package Ngay_8;

public class TennisGame {
    static final int scoreFour = 4;
    static String score = "";

    public static String getScore(String onePlayer, String twoPlayer, int scoreOne, int scoreTwo) {

        int tempScore = 0;
        boolean check = scoreOne == scoreTwo;
        boolean oneGreaterThanFour = scoreOne >= scoreFour;
        boolean twoGreaterThanFour = scoreOne >= scoreFour;
        if (check) {
            ConditionOne(scoreOne);
        } else if (oneGreaterThanFour || twoGreaterThanFour) {
            ConditionTwo(scoreOne, scoreTwo);
        } else {
            ConditionThirt(tempScore, scoreTwo, scoreOne);
        }
        return score;

    }

    public static void ConditionOne(int scoreOne) {
        switch (scoreOne) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
    }

    public static void ConditionTwo(int scoreOne, int scoreTwo) {
        int minusResult = scoreOne - scoreTwo;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }

    public static void ConditionThirt(int tempScore, int scoreTwo, int scoreOne) {
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOne;
            else {
                score += "-";
                tempScore = scoreTwo;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
    }
}