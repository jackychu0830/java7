package ch11;

import java.io.*;

public class A {

    public void method() throws IOException {
    }
}

class A1 extends A {

    public void method() throws FileNotFoundException {
    }
}

class A2 extends A {

    public void method() throws Exception {
    }
}