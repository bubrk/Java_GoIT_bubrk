package module2;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for module2.Task1
 */
public class Task1Test {

    private static final double DELTA = 1e-15;
    private final double[] a1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private final double[] a2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private final double[] a3 = {10, 10, 1, 2, 3, 4, 5, 6, 7, 8};
    private final double[] a4 = {-1, -10, 0, -1, -11, 1, -1, -1, -1, -1};

    @Test
    public void getSum() throws Exception {

        double result = Task1.getSum(a1);
        Assert.assertEquals(0, result, DELTA);

        result = Task1.getSum(a2);
        Assert.assertEquals(10, result, DELTA);
    }

    @Test
    public void getMax() throws Exception {
        double result = Task1.getMax(a3);
        Assert.assertEquals(10, result, DELTA);

        result = Task1.getMax(a4);
        Assert.assertEquals(1, result, DELTA);
    }

    @Test
    public void getMin() throws Exception {
        double result = Task1.getMin(a3);
        Assert.assertEquals(1, result, DELTA);

        result = Task1.getMin(a4);
        Assert.assertEquals(-11, result, DELTA);
    }

    @Test
    public void getMaxPositive() throws Exception {
        double result = Task1.getMaxPositive(a3);
        Assert.assertEquals(10, result, DELTA);

        result = Task1.getMaxPositive(a4);
        Assert.assertEquals(1, result, DELTA);
    }

    @Test
    public void getMultiplication() throws Exception {
        double result = Task1.getMultiplication(a1);
        Assert.assertEquals(0, result, DELTA);

        result = Task1.getMultiplication(a2);
        Assert.assertEquals(1, result, DELTA);
    }

    @Test
    public void getModulus() throws Exception {
        double result = Task1.getModulus(a3);
        Assert.assertEquals(2, result, DELTA);

        result = Task1.getModulus(a4);
        Assert.assertEquals(0, result, DELTA);
    }

    @Test
    public void getSecondLargest() throws Exception {
        double[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = Task1.getSecondLargest(a1);
        Assert.assertEquals(9, result, DELTA);

        //working on parameterized test

       /* double[] a2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        result = Task1.getSecondLargest(a2);
        Assert.assertEquals(9, result, DELTA);

        double[] a3 = {10, 10, 1, 2, 3, 4, 5, 6, 7, 8};
        result = Task1.getSecondLargest(a3);
        Assert.assertEquals(8, result, DELTA);

        double[] a4 = {8, 10, 2, 4, 5, 6, 7, 8, 9, 1};
        result = Task1.getSecondLargest(a4);
        Assert.assertEquals(9, result, DELTA);

        double[] a5 = {8, 2, 3, 4, 5, 6, 7, 8, 10, 10};
        result = Task1.getSecondLargest(a5);
        Assert.assertEquals(8, result, DELTA);

        double[] a6 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0};
        result = Task1.getSecondLargest(a6);
        Assert.assertEquals(0, result, DELTA);

        double[] a7 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        result = Task1.getSecondLargest(a7);
        Assert.assertEquals(0, result, DELTA);

        double[] a8 = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        result = Task1.getSecondLargest(a8);
        Assert.assertEquals(0, result, DELTA);

        double[] a9 = {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        result = Task1.getSecondLargest(a9);
        Assert.assertEquals(0, result, DELTA);

        double[] a10 = {0, -1, -2, -3, -4, -5, -6, -7, -8, -9};
        result = Task1.getSecondLargest(a10);
        Assert.assertEquals(-1, result, DELTA);

        double[] a11 = {10, 10, 1, 2, 3, 8, 5, 6, 7, 4};
        result = Task1.getSecondLargest(a11);
        Assert.assertEquals(8, result, DELTA);*/
    }

}