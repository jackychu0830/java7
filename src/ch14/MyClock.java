package ch14;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MyClock implements Runnable {

    Frame f;
    Label time;

    public static void main(String argv[]) {
        new MyClock();
    }

    public MyClock() {
        f = new Frame("MyClock");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        time = new Label(getTime());
        time.setFont(new Font("Arial", Font.PLAIN, 36));

        f.add(time, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);

        Thread th = new Thread(this);
        th.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                time.setText(getTime());
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }

    private String getTime() {
        GregorianCalendar gc = new GregorianCalendar();

        return gc.get(GregorianCalendar.HOUR) + ":"
            + gc.get(GregorianCalendar.MINUTE) + ":"
            + gc.get(GregorianCalendar.SECOND);
    }
}