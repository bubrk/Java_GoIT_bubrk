package module_10.task5;

/**
 * Create three new types of exceptions. Write a class with a method that throws all three. In main( ), call the method
 * but only use a single catch clause that will catch all three types of exceptions.
 */


public class Main {

    /*
    * "Write a class with a method that throws all three..."
    * Is it possible to throw more than one exception in one time?
    */
    static void myMethod() throws Ex1, Ex2, Ex3 {
        //throw new Ex1();
        //throw new Ex2();
        throw new Ex3();
    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (Exception e) {
            System.out.println("We've got exception - " + e.getMessage());
        }
    }
}
