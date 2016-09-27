package module6.task1_3;

import java.util.Arrays;

/**
 * *********************************************
 * ЗАДАНИЕ 1
 * Create ArraysUtils with following methods
 * <p>
 * sum(int array[])
 * min(int array[])
 * max(int array[])
 * maxPositive(int array[])
 * multiplication  (int array[])
 * modulus(int array[])
 * secondLargest(int array[])
 * <p>
 * these should be just copied from your HW2.
 * <p>
 * In addition add new methods
 * <p>
 * int[] reverse(int[] array)
 * int[] findEvenElements(int[] array)
 * *********************************************
 * ЗАДАНИЕ 2
 * In HW2 use methods from your ArraysUtils.
 * *********************************************
 * ЗАДАНИЕ 3
 * Make sure nobody can inherit your ArraysUtils.
 * *********************************************
 */
public final class ArraysUtils {

    //This method returns sum of elements
    public static int getSum(int[] anArray) {
        int sum = 0; //sum of elements

        for (int element : anArray) {
            sum += element;
        }

        return sum;
    }


    //This method returns the maximum of elements
    public static int getMax(int[] anArray) {
        int max = anArray[0]; //the maximum

        for (int element : anArray) {
            max = Math.max(element, max);
        }

        return max;
    }


    //This method returns the minimum of elements
    public static int getMin(int[] anArray) {
        int min = anArray[0]; //the minimum

        for (int element : anArray) {
            min = Math.min(element, min);
        }

        return min;
    }


    //This method returns maximum of positive elements or -1 if there is no positive elements in array
    public static int getMaxPositive(int[] anArray) {
        int maxPositive = -1; //the maximum positive

        for (int element : anArray) {
            if (element > 0)
                maxPositive = Math.max(element, maxPositive);
        }

        return maxPositive;
    }


    //This method returns multiplication of elements
    public static int getMultiplication(int[] anArray) {
        int result = 1; //the result of multiplication

        for (int element : anArray) {
            result *= element;
        }

        return result;
    }


    //This method returns modulus of the first and last elements
    public static int getModulus(int[] anArray) {

        return anArray[0] % anArray[anArray.length - 1];
    }


    //This method returns second largest element
    public static int getSecondLargest(int[] anArray) {
        int max = anArray[0], secondLargest = anArray[0];

        for (int element : anArray) {
            if (element > max) {
                secondLargest = max;
                max = element;
            } else if ((element < max) && ((secondLargest == max) || secondLargest < element)) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }

    public static int[] reverse(int[] anArray) {
        int[] reversedArray = new int[anArray.length];

        int i = anArray.length - 1;
        for (int element : anArray) {
            reversedArray[i--] = element;
        }

        return reversedArray;
    }

    public static int[] findEvenElements(int[] anArray) {
        int[] evenElementsArray = new int[0];

        for (int element : anArray) {
            if (element % 2 == 0) {
                evenElementsArray = Arrays.copyOf(evenElementsArray, evenElementsArray.length + 1);
                evenElementsArray[evenElementsArray.length - 1] = element;
            }
        }

        if (evenElementsArray.length == 0) {
            return null;
        } else return evenElementsArray;
    }
}
