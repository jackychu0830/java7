package ch15;

import static ch15.Holiday.*;
import java.util.*;

public class EnumMapExample {

    public static void main(String[] args) {
        EnumMap<Holiday, String> desc = new EnumMap<Holiday, String>(Holiday.class);
        desc.put(NewYear, "元旦");
        desc.put(Valentine, "西洋情人節");
        desc.put(Halloween, "萬聖節");
        desc.put(Christmas, "聖誕節");

        for (Holiday day : Holiday.values()) {
            System.out.printf("%s(%s)\n", desc.get(day), day.getDate());
        }
    }
}
