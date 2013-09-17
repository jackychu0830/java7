package ch5;

public class ForLoop {

    public static void main(String argv[]) {
        int i, sum;

        sum = 0;
        for (i = 1; sum <= 1000; sum += i++) {
            System.out.println("i=" + i);
        }
        System.out.println("sum=" + sum);
    }
}
