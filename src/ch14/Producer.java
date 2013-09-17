package ch14;

public class Producer extends Thread {

    private String name;
    private Storage s;

    public Producer(String n, Storage s) {
        name = n;
        this.s = s;
    }

    public void run() {
        while (true) {
            s.addData(name);

            try {
                sleep((int) Math.random() * 3000);
            } catch (InterruptedException e) {
            }
        }
    }
}