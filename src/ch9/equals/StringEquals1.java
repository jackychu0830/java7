package ch9.equals;

public class StringEquals1 {

    public static void main(String argv[]) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = new String("Java");
        String str4 = str1;

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
