package ch12;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyNotepad2 extends WindowAdapter implements ActionListener {

    Frame f;
    Button btn;
    TextArea ta;
    String fileName;

    public static void main(String argv[]) {
        new MyNotepad2("123.txt");
    }

    public MyNotepad2(String fileName) {
        this.fileName = fileName;
        f = new Frame(fileName);
        f.addWindowListener(this);

        btn = new Button("儲存檔案");
        btn.addActionListener(this);

        ta = new TextArea(10, 40);

        f.add(ta, BorderLayout.CENTER);
        f.add(btn, BorderLayout.SOUTH);

        f.pack();
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            FileWriter fout = new FileWriter(fileName);
            fout.write(ta.getText());
            fout.close();
        } catch (IOException ioe) {
            System.err.println(e);
        }
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}