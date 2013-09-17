package ch9.equals;

public class MyObject {

    private int data;

    public MyObject(int i) {
        this.data = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof MyObject)) {
            if (this.data == ((MyObject) obj).data) {
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        return (new Integer(data).hashCode());
    }
}
