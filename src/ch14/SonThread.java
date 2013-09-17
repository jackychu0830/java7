package ch14;

public class SonThread implements Runnable {

    public void run() {
        System.out.println("兒子出門去買米酒");
        System.out.println("兒子買東西來回需5分鐘");

        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.print(i + "分鐘 ");
            }
        } catch (InterruptedException ie) {
            System.err.println("兒子發生意外");
        }

        System.out.println("\n兒子買米酒回來了");
    }
}