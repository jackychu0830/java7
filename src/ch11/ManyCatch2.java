package ch11;

public class ManyCatch2 {

    public static void main(String argv[]) {
        String[] num = {"0", "1", "1.0"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println("i = " + num[i]);
                int j = Integer.parseInt(num[i]);
                int ans = 10 / j;
            } catch (RuntimeException re) {
                System.out.println("RutimeException: " + re);
            } catch (ArithmeticException ae) {
                System.out.println("You must input a nonzero number!");
            } catch (NumberFormatException ne) {
                System.out.println("You must input a integer number!");
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
