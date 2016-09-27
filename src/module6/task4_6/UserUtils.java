package module6.task4_6;

import java.util.Arrays;

/**
 * ЗАДАНИЕ 5
 * <p>
 * Create сlass UserUtils with following methods
 * <p>
 * User[] uniqueUsers(User[] users)
 * User[] usersWithContitionalBalance(User[] users, int balance)
 * User[] paySalaryToUsers(User[] users)
 * long[] getUsersId(User[] users)
 * User[] deleteEmptyUsers(User[] users)
 * <p>
 * Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.
 */
public class UserUtils {

    /**
     * Users are equal if all fields are the same except id
     * Unique User is one that isn't equal to others
     */
    public static User[] uniqueUsers(User[] users) {
        User[] result = new User[0];

        for (User user1 : users) {
            boolean isUnique = true;

            for (User user2 : users) {
                if (user1.getId() != user2.getId() && user1.equals(user2)) {
                    isUnique = false;
                }
            }
            if (isUnique) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user1;
            }
        }
        if (result.length == 0) {
            return null;
        } else {
            return result;
        }
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        User[] result = new User[0];

        for (User user : users) {
            if (user.getBalance() == balance) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }

        if (result.length == 0) {
            return null;
        } else {
            return result;
        }
    }

    public static final User[] paySalaryToUsers(User[] users) {

        for (User user : users) {
            user.setBalance(user.getBalance() + user.getSalary());
        }

        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            result[i] = users[i].getId();
        }
        return result;
    }

    /**
     * Empty in this case means that firstName and LastName are empty or null
     */
    public static User[] deleteEmptyUsers(User[] users) {
        User[] result = new User[0];

        for (User user : users) {
            if ((user.getFirstName() != null && user.getFirstName().length() != 0)
                    && (user.getLastName() != null && user.getLastName().length() != 0)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = user;
            }
        }

        if (result.length == 0) {
            return null;
        } else {
            return result;
        }
    }

}
