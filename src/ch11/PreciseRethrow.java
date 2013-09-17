package ch11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PreciseRethrow {

    public void foo() throws IOException, FileNotFoundException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("c:\\temp.txt"));
            String line = br.readLine();
        } catch (Exception e) {
            throw e;
        }
    }
}
