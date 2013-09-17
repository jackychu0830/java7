package ch5;

public class ScoreLevel3 {

    public static void main(String argv[]) {
        int score;
        String finalScore = "";

        score = 100;

        if (score >= 90 && score <= 100) {
            finalScore = "甲";
        }
        if (score >= 80 && score < 90) {
            finalScore = "乙";
        }
        if (score >= 70 && score < 80) {
            finalScore = "丙";
        }
        if (score >= 60 && score < 70) {
            finalScore = "丁";
        }
        if (score < 60) {
            finalScore = "戊";
        }

        System.out.println("你的成績等級為：" + finalScore);
    }
}