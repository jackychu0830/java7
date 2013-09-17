package ch12;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyNotepad extends WindowAdapter implements ActionListener {

    Frame f;
    Button btn;
    TextArea ta;
    String fileName;

    public static void main(String argv[]) {
        new MyNotepad("123.txt");
    }

    public MyNotepad(String fileName) {
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
            FileOutputStream fout = new FileOutputStream(fileName);
            //FileOutputStream fout = new FileOutputStream(fileName, true);
            byte buf[] = ta.getText().getBytes();
            fout.write(buf);
            fout.close();
        } catch (IOException ioe) {
            System.err.println(e);
        }
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}