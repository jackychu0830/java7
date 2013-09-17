package ch10;

import java.util.*;

public class StringTokenizerExample {

    public static void main(String argv[]) {
        StringTokenizer st = new StringTokenizer(argv[0]);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}