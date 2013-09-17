package ch13.generic;

import java.util.*;

public class DataSource2 {

    public static List<String> getCheckedData() {
        List<String> data = Collections.checkedList(new ArrayList<String>(), String.class);
        return data;
    }
}
