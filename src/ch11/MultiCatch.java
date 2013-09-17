package ch11;

public class MultiCatch {

    public static void main(String argv[]) {
        String[] num = {"0", "1", "1.0"};
        
        for (int i=0; i<4; i++) {
            try {
                System.out.println("i = " + num[i]);
                int j = Integer.parseInt(num[i]);
                int ans = 10 / j;
            } catch (ArithmeticException | NumberFormatException e) {
                System.out.println("You must input a number!");
            } catch (RuntimeException re) {
                System.out.println("RutimeException: " + re);
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }
}
