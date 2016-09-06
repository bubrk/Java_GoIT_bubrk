package module4.task5;

import module4.task4.User;

/**
 * ******************************************************************
 * ЗАДАНИЕ 5
 * ******************************************************************
 * Create interface BankSystem with methods:
 * <p>
 * void withdrawOfUser(User user, int amount)
 * void fundUser(User user, int amount)
 * void transferMoney(User fromUser, User toUser, int amount)
 * void paySalary(User user)
 * <p>
 * And its implementation
 */
public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {

        if (user.getBank().getLimitOfWithdrawal() >= amount) {

            double amountWithCommission = amount * (1 + (double) user.getBank().getCommission(amount) / 100);

            if (user.getBalance() >= amountWithCommission) {
                user.setBalance(user.getBalance() - amountWithCommission);
            }
        }
    }

    @Override
    public void fundUser(User user, int amount) {

        if (user.getBank().getLimitOfFunding()==0 || user.getBank().getLimitOfFunding()>=amount){
            user.setBalance(user.getBalance()+amount);
        }

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        /**
         * transferring money is possible between accounts with same currency only;
         * limitations are not taken into account
         * commission is charged from the 'fromUser'
         * */
        if (fromUser.getBank().getCurrency()==toUser.getBank().getCurrency()){

            double amountWithCommission = amount * (1 + (double) fromUser.getBank().getCommission(amount) / 100);

            if (fromUser.getBalance()>=amountWithCommission){
                fromUser.setBalance(fromUser.getBalance()-amountWithCommission);
                toUser.setBalance(toUser.getBalance()+amount);
            }
        }
    }

    @Override
    public void paySalary(User user) {

        user.setBalance(user.getBalance()+user.getSalary());

    }
}
