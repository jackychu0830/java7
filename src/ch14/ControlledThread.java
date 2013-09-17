package ch14;

public class ControlledThread extends Thread {

    static final int RUN = 0;
    static final int SUSP = 1;
    static final int STOP = 2;
    private int state = RUN;

    public synchronized void setState(int s) {
        state = s;
        if (state == RUN) {
            notify();
        }
    }

    public synchronized boolean checkState() {
        while (state == SUSP) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        if (state == STOP) {
            return false;
        }

        return true;
    }

    public void run() {
        while (true) {
            //some code to run

            if (!checkState()) {
                break;
            }
        }
    }
}