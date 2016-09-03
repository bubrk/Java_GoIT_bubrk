package module3.task2;

/**
 * Write class named Adder that inherits from a superclass named Arithmetic. Also class Adder must contain method
 * check that compare two numbers and returns true if a>=b and false in other cases.
 * */

public class Adder extends Arithmetic {

    public boolean check(Integer a, Integer b) {

        return (a >= b);
    }
}
