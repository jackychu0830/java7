package ch8;

public class Scope {

    static int i = 3;
    int j = 5;

    public static void main(String argv[]) {
        i = 10;
        j = 20;

        Scope s = new Scope();
        s.A(2);
        s.B(30);
    }

    public void A(int i) {
        int j, k;

        i++;
        j = 10;
        k = i + j;
        Scope.i = i;
        this.j = j;

        for (int x; x < 10; x++) {
            k += x;
        }
    }

    public void B(int i) {
        i++;
        this.i = i;
    }
}