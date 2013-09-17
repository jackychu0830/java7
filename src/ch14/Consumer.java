package ch14;

public class Consumer extends Thread {

    private String name;
    private Storage s;

    public Consumer(String n, Storage s) {
        name = n;
        this.s = s;
    }

    public void run() {
        while (true) {
            s.delData(name);

            try {
                sleep((int) Math.random() * 3000);
            } catch (InterruptedException e) {
            }
        }
    }
}