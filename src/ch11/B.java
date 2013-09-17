package ch11;

import java.io.*;

public class B {

    public void method() throws IOException,
        RuntimeException {
    }
}

class B1 extends B {

    public void method() throws FileNotFoundException {
    }
}

class B2 extends B {

    public void method() throws FileNotFoundException,
        ArithmeticException,
        java.sql.SQLException {
    }
}

class B3 extends B {

    public void Method() throws FileNotFoundException,
        ArithmeticException,
        NullPointerException {
    }
}
