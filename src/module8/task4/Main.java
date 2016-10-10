package module8.task4;

import static java.util.Arrays.asList;

/**
 * Testing UserDAO
 */
public class Main {
    public static void main(String[] args) {
        UserDAO userBD = new UserDAO();

        userBD.save(new User(0, "Alexandr"));
        userBD.save(new User(1, "Olga"));
        userBD.save(new User(2, "Semen"));

        userBD.saveAll(asList(
                new User(3, "Ivanov"),
                new User(4, "Petrov"),
                new User(5, "Sidorov")));

        System.out.println("\nBD after adding users:");
        for (User user : userBD.getList()) {
            System.out.println(user.toString());
        }

        userBD.delete(new User(3, "Ivanov"));
        userBD.deleteAll(asList(
                new User(5, "Sidorov"),
                new User(4, "Petrov"),
                new User(6, "Viktor")));

        System.out.println("\nBD after deleting users:");
        for (User user : userBD.getList()) {
            System.out.println(user.toString());
        }

        System.out.println("\nUser with id=1: "+userBD.get(1).toString());

        System.out.println("\nDeleting user with id=2:");
        userBD.deleteById(2);

        for (User user : userBD.getList()) {
            System.out.println(user.toString());
        }
    }
}
