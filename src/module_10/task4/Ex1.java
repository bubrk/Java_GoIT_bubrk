package module_10.task4;

/**
 * Defining exception
 */
public class Ex1 extends Exception {
    private String exMessage;

    public Ex1(String exMessage) {
        this.exMessage = exMessage;
    }

    @Override
    public String getMessage() {
        return exMessage;
    }
}
