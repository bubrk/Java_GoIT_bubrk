package module2;

import java.util.Arrays;

/**
 * This is homework for Module 2 of JavaCore course.
 * <p>
 * "Input: array with size=10 can be one of two data types: Int and double. Elements of the array is a natural number. Calculate:
 * - sum
 * - min/max
 * - max positive
 * - multiplication
 * - modulus of first and last element
 * as a result you should have 6 methods"
 */

public class Task1 {

    //This method returns sum of elements
    public static double getSum(double[] anArray) {
        double sum = 0; //sum of elements

        for (double element : anArray) {
            sum += element;
        }

        return sum;
    }

    //Same for int[] array............ is it OK to do in this way?
    public static int getSum(int[] anArray) {

        return (int) getSum(convertIntToDouble(anArray));
    }


    //This method returns the maximum of elements
    public static double getMax(double[] anArray) {
        double max = anArray[0]; //the maximum

        for (int i = 1; i < anArray.length; i++) {
            max = Math.max(anArray[i], max);
        }

        return max;
    }

    //Same for int[] array
    public static int getMax(int[] anArray) {

        return (int) getMax(convertIntToDouble(anArray));
    }


    //This method returns the minimum of elements
    public static double getMin(double[] anArray) {
        double min = anArray[0]; //the minimum

        for (int i = 1; i < anArray.length; i++) {
            min = Math.min(anArray[i], min);
        }

        return min;
    }

    //Same for int[] array
    public static int getMin(int anArray[]) {

        return (int) getMin(convertIntToDouble(anArray));
    }


    //This method returns maximum of positive elements or -1 if there is no positive elements in array
    public static double getMaxPositive(double[] anArray) {
        double maxPositive = -1; //the maximum positive

        for (double element : anArray) {
            if (element > 0)
                maxPositive = Math.max(element, maxPositive);
        }

        return maxPositive;
    }

    //Same for int[] array
    public static int getMaxPositive(int[] anArray) {

        return (int) getMaxPositive(convertIntToDouble(anArray));
    }


    //This method returns multiplication of elements
    public static double getMultiplication(double[] anArray) {
        double result = 1; //the result of multiplication

        for (double element : anArray) {
            result *= element;
        }

        return result;
    }

    //Same for int[] array
    public static int getMultiplication(int[] anArray) {

        return (int) getMultiplication(convertIntToDouble(anArray));
    }

    //This method returns modulus of the first and last elements
    public static double getModulus(double[] anArray) {

        return anArray[0] % anArray[anArray.length - 1];
    }

    //Same for int[] array
    public static int getModulus(int[] anArray) {

        return (int) getModulus(convertIntToDouble(anArray));
    }


    //This method returns second largest element
    public static double getSecondLargest(double[] anArray) {
        double max = anArray[0], secondLargest = anArray[0];

        for (double element : anArray) {
            if (element > max) {
                secondLargest = max;
                max = element;
            } else if ((element < max) && ((secondLargest == max) || secondLargest < element)) {
                secondLargest = element;
            }
        }

        return secondLargest;
    }

    //Same for int[] array
    public static int getSecondLargest(int[] anArray) {

        return (int) getSecondLargest(convertIntToDouble(anArray));
    }

    //This method converts int array into double array
    private static double[] convertIntToDouble(int[] intArray) {
        double[] doubleArray = new double[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            doubleArray[i] = (double) intArray[i];
        }

        return doubleArray;
    }

    // main method which initializes array and call methods
    public static void main(String[] args) {

        //initializing new array
        //double[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] anArray = {10, 10, 1, 2, 3, 4, 5, 6, 7, 8};
        //double[] anArray = {3.75,7.84,1.1,10.51,4.36,7.7,9.52,64.47,100.79,8.88};
        //int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Calling methods and printing results
        System.out.println("Input array: " + Arrays.toString(anArray));
        System.out.println("Sum of elements = " + getSum(anArray));
        System.out.println("The maximum is " + getMax(anArray));
        System.out.println("The minimum is " + getMin(anArray));
        if (getMaxPositive(anArray) == -1) System.out.println("There is no positive elements in array");
        else System.out.println("The maximum positive is " + getMaxPositive(anArray));
        System.out.println("The result of multiplication = " + getMultiplication(anArray));
        System.out.println("Modulus of the first and last elements = " + getModulus(anArray));
        System.out.println("Second largest element is " + getSecondLargest(anArray));




    }
}
