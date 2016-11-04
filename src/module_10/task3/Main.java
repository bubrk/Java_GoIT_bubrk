package module_10.task3;

import java.util.Set;

/**
 * Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code
 * in a try-catch clause to catch the exception.
 */
public class Main {
    public static void main(String[] args) {

        Set<String> set = null;

        try {
            set.add("Hello!");
        } catch (NullPointerException e) {
            System.out.println("Yeap! we caught it! message: " + e.getMessage());
        }
    }
}
