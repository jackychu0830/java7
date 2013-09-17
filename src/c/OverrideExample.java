package c;

public class OverrideExample {

    @Override
    public String toString() {
        return "Annotation Type Example - Override!";
    }

    @Override
    public boolean equals(OverrideExample obj) {
        return false;
    }

    @Override
    public void foo() {
    }
}
