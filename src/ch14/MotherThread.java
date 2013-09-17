package ch14;

public class MotherThread implements Runnable {

    public void run() {
        System.out.println("媽媽準備煮飯");
        System.out.println("媽媽發現米酒用完了");
        System.out.println("媽媽叫兒子去買米酒");

        Thread son = new Thread(new SonThread());
        son.start();
        System.out.println("媽媽等待兒子把米酒買回來");

        try {
            son.join();
        } catch (InterruptedException ie) {
            System.err.println("發生例外！");
            System.err.println("媽媽中斷煮飯");
            System.exit(1);
        }

        System.out.println("媽媽開始煮飯");
        System.out.println("媽媽煮好飯了");
    }
}