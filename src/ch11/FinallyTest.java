package ch11;

public class FinallyTest {

    public static void main(String argv[]) {
        int i = Integer.parseInt(argv[0]);

        try {
            int ans = 10 / i;
            System.out.println("ans = " + ans);
        } catch (ArithmeticException e) {
            System.err.println(e);
        } finally {
            System.out.println("In the finally block!");
        }

        System.out.println("End of program.");
    }
}
