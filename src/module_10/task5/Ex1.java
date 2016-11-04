package module_10.task5;

/**
 * Defining exception
 */
public class Ex1 extends Exception {
    private String exMessage = "Exception 1";

    @Override
    public String getMessage() {
        return exMessage;
    }
}
