package module_10.task5;

/**
 * Defining exception
 */
public class Ex3 extends Exception {
    private String exMessage = "Exception 3";

    @Override
    public String getMessage() {
        return exMessage;
    }
}