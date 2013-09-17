package ch16;

import java.util.*;

public class VarargsExample3 {

    public static void main(String... args) {
        System.out.printf("Total command line arguments are %d%n", args.length);
        System.out.printf("The first argument's value is '%s'%n", args[0]);
        List data = Arrays.asList(args);
    }
}
