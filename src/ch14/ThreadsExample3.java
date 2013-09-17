package ch14;

public class ThreadsExample3 {

    public static void main(String argv[]) {
        ShareData s = new ShareData();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();
    }
}