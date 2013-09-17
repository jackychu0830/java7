package ch11;

import java.io.*;

public class OpenFileTest {

    public static void main(String argv[]) {
        String fileName = "";

        do {
            System.out.print("Please input a file name: ");
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);

            try {
                fileName = br.readLine();
            } catch (IOException e) {
                System.out.println(e);
            }
        } while (!openFile(fileName));

        System.out.println("Successed!");
    }

    public static boolean openFile(String fileName) {
        try {
            FileInputStream f = new FileInputStream(fileName);
            return true;
        } catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
            return false;
        }
    }
}
