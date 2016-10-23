package module_10.task4;

/**
 * Defining another exception
 */
public class Ex2 extends Exception {
    private String exMessage = "different exception";

    @Override
    public String getMessage() {
        return exMessage;
    }
}