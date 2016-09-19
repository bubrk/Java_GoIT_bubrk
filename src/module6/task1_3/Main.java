package module6.task1_3;

import java.util.Arrays;

import static module6.task1_3.ArraysUtils.getSum;

/**
 * Using methods from ArraysUtils
 */
public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5};

        System.out.println("For array = " + Arrays.toString(array));
        System.out.println("The maximum is " + ArraysUtils.getMax(array));
        System.out.println("The minimum is " + ArraysUtils.getMin(array));
        System.out.println("The second largest is " + ArraysUtils.getSecondLargest(array));
        System.out.println("The sum of elements is " + getSum(array));
        System.out.println("The multiplication of elements is " + ArraysUtils.getMultiplication(array));
        System.out.println("The modulus of the first and last elements is " + ArraysUtils.getModulus(array));
        System.out.println("All even elements are " + Arrays.toString(ArraysUtils.findEvenElements(array)));
        System.out.println("Reversed array: " + Arrays.toString(ArraysUtils.reverse(array)));

    }

}
