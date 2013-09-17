package ch14;

import java.awt.*;
import java.awt.event.*;

public class ThreadsExample6 extends WindowAdapter {

    Frame f;
    Button btnStart, btnStop, btnSusp, btnResume;
    Label lb;
    ControlledThread2 ct;

    public static void main(String argv[]) {
        new ThreadsExample6();
    }

    public ThreadsExample6() {
        f = new Frame("Controlled Thread Example");
        f.addWindowListener(this);

        lb = new Label("0", Label.CENTER);
        lb.setFont(new Font("Arial", Font.PLAIN, 36));

        btnStart = new Button("開始");
        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ct = new ControlledThread2(lb);
                ct.start();
                btnStart.setEnabled(false);
                btnStop.setEnabled(true);
                btnSusp.setEnabled(true);
            }
        });

        btnStop = new Button("停止");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ct.setState(ControlledThread2.STOP);
                btnStart.setEnabled(true);
                btnStop.setEnabled(false);
                btnSusp.setEnabled(false);
                btnResume.setEnabled(false);
            }
        });

        btnSusp = new Button("暫停");
        btnSusp.setEnabled(false);
        btnSusp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ct.setState(ControlledThread2.SUSP);
                btnStop.setEnabled(false);
                btnSusp.setEnabled(false);
                btnResume.setEnabled(true);
            }
        });

        btnResume = new Button("繼續");
        btnResume.setEnabled(false);
        btnResume.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ct.setState(ControlledThread2.RUN);
                btnStop.setEnabled(true);
                btnSusp.setEnabled(true);
                btnResume.setEnabled(false);
            }
        });

        Panel p = new Panel();
        p.add(btnStart);
        p.add(btnStop);
        p.add(btnSusp);
        p.add(btnResume);

        f.add(lb, BorderLayout.CENTER);
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}