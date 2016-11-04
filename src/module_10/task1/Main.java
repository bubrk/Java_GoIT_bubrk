package module_10.task1;

/**
 * Create a class with a main( ) that throws an object of class Exception inside a try block. Give the constructor for
 * Exception a String argument. Catch the exception inside a catch clause and print the String argument. Add a finally
 * clause and print a message to prove you were there.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Hi there! Let's go deeper...");
        try {
            System.out.println("Now we are in \"try\" block");
            throw new Exception("HELP!");
        } catch (Exception e) {
            System.out.println("We caught an exception! massage: " + e.getMessage());
        } finally {
            System.out.println("Now we are in \"finally\" block");
        }
    }
}
