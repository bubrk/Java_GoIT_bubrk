package module_10.task2;

/**
 * Create your own exception class using the extends keyword. Write a constructor for this class that takes a String
 * argument and stores it inside the object with a String reference. Write a method that prints out the stored String.
 * Create a try-catch clause to exercise your new exception.
 */
public class MyException extends Exception {
    private String myMessage;

    public MyException(String message) {
        this.myMessage = message;
    }

    public void printMyMessage(){
        System.out.println("MyException message: "+ myMessage);
    }
}
