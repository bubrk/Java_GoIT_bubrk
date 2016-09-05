package module4.task5;

import module4.task4.User;

/**
 *******************************************************************
 ЗАДАНИЕ 5
 *******************************************************************
 Create interface BankSystem with methods:

 void withdrawOfUser(User user, int amount)
 void fundUser(User user, int amount)
 void transferMoney(User fromUser, User toUser, int amount)
 void paySalary(User user)

 And its implementation
 */
public interface BankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
