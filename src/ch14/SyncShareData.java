package ch14;

public class SyncShareData implements Runnable {

    int i;

    public void run() {
        while (i < 10) {
            for (long j = 0; j < 5000000000L; j++);
            synchronized (this) {
                if (i < 10) {
                    i++;
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }
    }
}