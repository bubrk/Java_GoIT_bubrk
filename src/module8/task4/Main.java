package module8.task4;

import static java.util.Arrays.asList;

/**
 * Testing UserDAO
 */
public class Main {
    public static void main(String[] args) {
        UserDAO userBD = new UserDAO();

        userBD.save(new User(0,"Alexandr"));
        userBD.save(new User(1,"Olga"));

        userBD.saveAll(asList(
                new User(2,"Ivanov"),
                new User(3,"Petrov"),
                new User(4,"Sidorov")));

        userBD.getList().stream(){
            System.out.println();
        }


    }
}
