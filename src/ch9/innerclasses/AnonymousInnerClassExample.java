package ch9.innerclasses;

import java.awt.*;
import java.awt.event.*;

public class AnonymousInnerClassExample {

    public static void main(String argv[]) {
        Frame f = new Frame("Anonymous Inner Class Example");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setSize(200, 100);
        f.setVisible(true);
    }
}