package task5;

/**
 * Defining exception
 */
public class Ex2 extends Exception {
    private String exMessage = "Exception 2";

    @Override
    public String getMessage() {
        return exMessage;
    }
}
