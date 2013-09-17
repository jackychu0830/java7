package ch16;


public class ForeachExample {

    public static void main(String[] args) {
        System.out.print("Command line arguments are ");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("%s", args[i]);
        }
        System.out.println();

        System.out.print("Command line arguments are ");
        for (String str : args) {
            System.out.printf("%s", str);
        }
        System.out.println();
    }
}
