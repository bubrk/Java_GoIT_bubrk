package task2;

/**
 * Create your own exception class using the extends keyword. Write a constructor for this class that takes a String
 * argument and stores it inside the object with a String reference. Write a method that prints out the stored String.
 * Create a try-catch clause to exercise your new exception.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Stand up and stretch");
        } catch (MyException e) {
            System.out.println("We caught an exception!");
            e.printMyMessage();
        } finally {
            System.out.println("Finally...");
        }
    }
}
