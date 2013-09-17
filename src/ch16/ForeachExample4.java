package ch16;

public class ForeachExample4 {

    public static void main(String[] args) {
        MyCollection data = new MyCollection();
        data.add("Jacky");
        data.add("Piggy");
        data.add("Java");

        for (String str : data) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
