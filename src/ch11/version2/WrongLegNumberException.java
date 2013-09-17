package ch11.version2;

public class WrongLegNumberException extends RuntimeException {

    public WrongLegNumberException() {
        super("Leg number must be 0, 2, or 4!");
    }

    public WrongLegNumberException(String str) {
        super(str);
    }
}