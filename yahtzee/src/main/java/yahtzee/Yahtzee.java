package yahtzee;

public class Yahtzee implements YahtzeeScore {

    int[] score1 = new int[6];

    @Override
    public int score(int keuze, int dobbelsteen1, int dobbelsteen2, int dobbelsteen3,
                     int dobbelsteen4, int dobbelsteen5) {
        score1[0] = keuze;
        score1[1] = dobbelsteen1;
        score1[2] = dobbelsteen2;
        score1[3] = dobbelsteen3;
        score1[4] = dobbelsteen4;
        score1[5] = dobbelsteen5;
        int keer = 0;
        int resultaat = 0;

        if (keuze == 0) {
            if (score1[1] == score1[2] && score1[1] == score1[3] &&
                    score1[1] == score1[4] && score1[1] == score1[5]) {
                resultaat = 50;
            } else {
                for (int i = 1; i < 6; i++) {
                    resultaat += score1[i];
                }
            }
        }
        if (keuze != 0) {
            for (int i = 1; i < 6; i++) {
                if (keuze == score1[i])
                    keer++;
            }
            resultaat = keer*keuze;
        }
        return resultaat;
    }


}


