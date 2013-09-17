package ch16;

import java.util.*;

public class MyCollection implements Iterable<String> {

    private StringBuilder sb = new StringBuilder();

    public void add(String str) {
        if (sb.length() == 0) {
            sb.append(str);
        } else {
            sb.append(",").append(str);
        }
    }

    public Iterator<String> iterator() {
        return new MyIterator(sb.toString());
    }
}

class MyIterator implements Iterator<String> {

    StringTokenizer st = null;

    public MyIterator(String data) {
        st = new StringTokenizer(data, ",");
    }

    public boolean hasNext() {
        return st.hasMoreTokens();
    }

    public String next() {
        return st.nextToken();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
