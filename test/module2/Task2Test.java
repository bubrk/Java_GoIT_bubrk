package module2;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for module2.Task2
 */
public class Task2Test {

    private static final double DELTA = 1e-15;

    @Test
    public void withdrawBalance() throws Exception {
        Assert.assertEquals(89.5, Task2.withdrawBalance(100, 10), DELTA);
        Assert.assertEquals(100, Task2.withdrawBalance(100, 99), DELTA);
    }

    @Test
    public void withdrawBalance1() throws Exception {
        Assert.assertEquals(145, Task2.withdrawBalance("Ann", 100), DELTA);
        //Assert.assertEquals(500, Task2.withdrawBalance("Oww", 490), DELTA);
    }

    @Test
    public void fundBalance() throws Exception {
        Assert.assertEquals(600, Task2.fundBalance("Oww", 100), DELTA);
    }

}