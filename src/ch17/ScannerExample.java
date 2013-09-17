package ch17;

import java.io.*;
import static java.lang.System.*;
import java.util.*;

public class ScannerExample {

    public static void main(String[] args) throws IOException {
        //Variables declare
        int totalAge = 0;
        double totalHeight = 0.0;
        double totalWeight = 0.0;
        int totalPerson = 0;
        Map<String, Integer> cities = new HashMap<String, Integer>();

        //Read data from file
        Scanner sc = new Scanner(new FileReader("info.txt"));
        sc = sc.useDelimiter(",|\n");

        //Parsing data
        while (sc.hasNextInt()) {
            totalPerson++;
            int id = sc.nextInt();
            String name = sc.next();
            totalAge += sc.nextInt();
            totalHeight += sc.nextDouble();
            totalWeight += sc.nextDouble();
            String tel = sc.next();

            String city = sc.next();
            if (cities.containsKey(city)) {
                int count = cities.get(city) + 1;
                cities.put(city, count);
            } else {
                cities.put(city, 1);
            }
        }

        //Output result
        out.printf("Average age is %d.%n", totalAge / totalPerson);
        out.printf("Average height is %.2f.%n", totalHeight / totalPerson);
        out.printf("Average weight is %.2f.%n", totalWeight / totalPerson);

        Set<String> keys = cities.keySet();
        for (String city : keys) {
            out.printf("%d persons in %S.%n", cities.get(city), city);
        }
    }
}
