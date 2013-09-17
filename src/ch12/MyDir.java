package ch12;

import java.io.*;

public class MyDir {

    public static void main(String argv[]) {
        File f = new File(System.getProperty("user.dir"));
        File files[] = f.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                System.out.print("<Dir>\t");
            } else {
                System.out.print("\t" + files[i].length());
            }
            System.out.println("\t" + files[i].getName());
        }
    }
}