package module6.task4_6;

import java.util.Arrays;

/**
 * ЗАДАНИЕ 6
 * Create Main class with main method where you need to create some test users and demonstrate how every method
 * from UserUtils work.
 */
public class Main {


    public static void main(String[] args) {

        User[] anArrayOfUsers = new User[]{
                new User(1, "Jhon", "Snow", 4000, 10000),
                new User(2, "Nik", "Martin", 5000, 14000),
                new User(3, null, "", 0, 0),
                new User(4, "Jhon", "Snow", 4000, 10000),
                new User(5, "Mark", "White", 8000, 14000)};

        System.out.println("Users are:");
        printUserArray(anArrayOfUsers);

        /* Deleting empty users */
        if (UserUtils.deleteEmptyUsers(anArrayOfUsers) == null) {
            System.out.println("\nAll users were deleted with deleteEmptyUsers method");
        } else {
            System.out.println("\nDeleting empty users:");
            anArrayOfUsers = UserUtils.deleteEmptyUsers(anArrayOfUsers);
            printUserArray(anArrayOfUsers);
        }

        /* Looking for unique users */
        if (UserUtils.uniqueUsers(anArrayOfUsers) == null) {
            System.out.println("\nThere are not unique users");
        } else {
            System.out.println("\nUnique users:");
            printUserArray(UserUtils.uniqueUsers(anArrayOfUsers));
        }

        /* Looking for users with balance = 14000 */
        if (UserUtils.usersWithConditionalBalance(anArrayOfUsers, 14000) == null) {
            System.out.println("\nThere are not users with balance = 14000");
        } else {
            System.out.println("\nUsers with balance = 14000:");
            printUserArray(UserUtils.usersWithConditionalBalance(anArrayOfUsers, 14000));
        }

        /* Paying salary to users */
        System.out.println("\nPaying salary to users:");
        UserUtils.paySalaryToUsers(anArrayOfUsers);
        printUserArray(anArrayOfUsers);

        /* Printing users id */
        System.out.println("\nUsers id: ");
        System.out.println(Arrays.toString(UserUtils.getUsersId(anArrayOfUsers)));

    }

    /* Printing an array of users */
    private static void printUserArray(User[] users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }


}
