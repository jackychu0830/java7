package ch5;

public class Label {

    public static void main(String argv[]) {
        int i, j;
        Loop1:
        for (i = 1; i <= 5; i++) {
            Loop2:
            for (j = 1; j <= 5; j++) {
                if (j == 3) {
                    break Loop2;
                }

                if (i == j) {
                    continue Loop1;
                }

                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}
