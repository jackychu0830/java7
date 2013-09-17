package ch9.innerclasses;

public class InnerClassExample3 {

    private int att = 0;

    public static void main(String argv[]) {
        new InnerClassExample3();
    }

    public InnerClassExample3() {
        new Inner(2);
    }

    public class Inner {

        private int att = 1;

        public Inner(int att) {
            System.out.println(att);
            System.out.println(this.att);
            System.out.println(InnerClassExample3.this.att);
        }
    }
}