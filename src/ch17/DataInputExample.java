package ch17;

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class DataInputExample {

    public static void main(String[] args) throws IOException {
        //Variables declare
        int totalAge = 0;
        double totalHeight = 0.0;
        double totalWeight = 0.0;
        int totalPerson = 0;
        Map<String, Integer> cities = new HashMap<String, Integer>();

        //Read data from file
        BufferedReader br = new BufferedReader(
            new FileReader("info.txt"));

        //Parsing data
        String data;
        while ((data = br.readLine()) != null) {
            totalPerson++;
            StringTokenizer st = new StringTokenizer(data, ",");
            if (st.hasMoreTokens()) {
                int no = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                totalAge += Integer.parseInt(st.nextToken());
                totalHeight += Double.parseDouble(st.nextToken());
                totalWeight += Double.parseDouble(st.nextToken());
                String tel = st.nextToken();

                String city = st.nextToken();
                if (cities.containsKey(city)) {
                    int count = cities.get(city) + 1;
                    cities.put(city, count);
                } else {
                    cities.put(city, 1);
                }
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
