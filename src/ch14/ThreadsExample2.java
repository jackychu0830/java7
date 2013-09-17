package ch14;

public class ThreadsExample2 {

    public static void main(String argv[]) {
        ShareData s1 = new ShareData();
        ShareData s2 = new ShareData();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t1.start();
        t2.start();
    }
}