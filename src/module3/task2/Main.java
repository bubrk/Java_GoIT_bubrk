package module3.task2;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        Adder myAdder=new Adder();

        System.out.println("3 + 4 = " + myAdder.add(3,4));
        System.out.println("is 3 >= 4 ? "+myAdder.check(3,4));
    }
}
