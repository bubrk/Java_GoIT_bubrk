package module_10.task4;

/**
 * Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define. In f( ),
 * call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you
 * define). Test your code in main( ).
 */
public class Main {

    /**
     * g() method
     */
    static void g() throws Ex1 {
        System.out.println("This is g() method");
        throw new Ex1("Ex1 exception");
    }

    /**
     * f() method
     */
    static void f() throws Ex2 {
        System.out.println("This is f() method");
        try {
            g();
        } catch (Ex1 e) {
            System.out.println("We caught Ex1 exception. Message: " + e.getMessage());
            throw new Ex2();
        }
    }

    public static void main(String[] args) {
        System.out.println("Testing...");
        try {
            f();
        } catch (Ex2 e){
            System.out.println("We caught Ex2 exception. Message: " + e.getMessage());
        } finally {
            System.out.println("Test completed");
        }
    }


}
