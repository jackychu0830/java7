package ch5;

public class NineNine {

    public static void main(String argv[]) {
        int i, j;
        for (i = 2; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.print("\n");
        }
    }
}
