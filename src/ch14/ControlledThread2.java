package ch14;

import java.awt.*;

public class ControlledThread2 extends Thread {

    static final int RUN = 0;
    static final int SUSP = 1;
    static final int STOP = 2;
    private int state = RUN;
    private int i;
    private Label lb;

    public ControlledThread2(Label l) {
        lb = l;
    }

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
            i++;
            lb.setText(String.valueOf(i));

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }

            if (!checkState()) {
                break;
            }
        }
    }
}