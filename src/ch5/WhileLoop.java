package ch5;

public class WhileLoop {

    public static void main(String argv[]) {
        int i, sum;

        i = 1;
        sum = 0;
        while (sum <= 1000) {
            System.out.println("i=" + i);
            sum += i++;
        }
        System.out.println("sum=" + sum);
    }
}
