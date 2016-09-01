package module3.task4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing User class which was created in Task 4
 */

public class UserTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user= new User();
        user.setCompanyName("1234567890");
    }

    @Test
    public void withdraw() throws Exception {
        user.setBalance(1000);
        Assert.assertEquals(895,user.withdraw(100));
    }

    @Test
    public void companyNameLength() throws Exception {
        Assert.assertEquals(10,user.companyNameLength());
    }

    @Test
    public void monthIncreaser() throws Exception {
        user.setMonthOfEmployment(1);
        user.monthIncreaser(1);
        Assert.assertEquals(2,user.getMonthOfEmployment());
    }

}