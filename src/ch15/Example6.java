package ch15;

public class Example6 {

    public static void main(String[] args) {
        for (Holiday day : Holiday.values()) {
            System.out.printf("%s is on %s\n", day.name(), day.getDate());
        }
    }
}