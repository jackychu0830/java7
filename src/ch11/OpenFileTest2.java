package ch11;

import java.io.*;

public class OpenFileTest2 {

    public static void main(String argv[]) {
        String fileName = "";

        do {
            System.out.print("Please input a file name: ");
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);

            try {
                fileName = br.readLine();
                openFile(fileName);
                break;
            } catch (IOException e) {
                System.out.println(e.getLocalizedMessage());
            }
        } while (true);

        System.out.println("Successed!");
    }

    public static void openFile(String fileName) throws FileNotFoundException {
        FileInputStream f = new FileInputStream(fileName);
    }
}
