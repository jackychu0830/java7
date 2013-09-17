package ch14;

public class Storage {

    private int count;
    private int size;

    public Storage(int s) {
        size = s;
    }

    public synchronized void addData(String n) {
        while (count == size) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }

        this.notify();
        count++;
        System.out.println(n + " make data count: " + count);
    }

    public synchronized void delData(String n) {
        while (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }

        this.notify();
        System.out.println(n + " use data count: " + count);
        count--;
    }
}