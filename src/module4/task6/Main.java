package module4.task6;

import module4.task2.Currency;
import module4.task3.ChinaBank;
import module4.task3.EUBank;
import module4.task3.USBank;
import module4.task4.User;
import module4.task5.BankSystemImpl;

/**
 *******************************************************************
 ЗАДАНИЕ 6
 *******************************************************************
 Сreate Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank and 2 of ChinaBank.
 Run four different operations with every User’s balance and print its objects to console.
 */
public class Main {

    public static void main(String[] args) {

        //USBank users
        User user1= new User(1,"Abramovich",40000,8,"Chelsea",4000,
                new USBank(1,"USA", Currency.USD,300,4000,90,10000000));

        User user2= new User(2,"Kaganovich",20000,2,"Mars",4500,
                new USBank(2,"France", Currency.EUR,270,4200,92,12000000));

        //EUBank users
        User user3= new User(3,"Ivanov",4500,4,"PizzaBar",1500,
                new EUBank(3,"Italia", Currency.USD,70,2000,72,1000000));

        User user4= new User(4,"Petrov",15000,2,"BMW",3000,
                new EUBank(4,"Germany", Currency.EUR,220,5000,97,42000000));

        //ChinaBank users
        User user5= new User(5,"Sidorchuk",45000,12,"AliExpress",6000,
                new ChinaBank(5,"Hong Kong", Currency.USD,170,3200,90,15000000));

        User user6= new User(6,"Mao",30000,7,"TaoBao",5000,
                new ChinaBank(6,"Hong Kong", Currency.EUR,400,2200,95,20000000));


        BankSystemImpl bankSystem = new BankSystemImpl();

        System.out.println("Initializing user1:");
        System.out.println(user1.toString());
        System.out.println("***");

        System.out.println("Withdrawing 1000$ from user1 account:");
        bankSystem.withdrawOfUser(user1,1000);
        System.out.println(user1.toString());
        System.out.println("***");

        System.out.println("Funding user1 with 2000$:");
        bankSystem.fundUser(user1,2000);
        System.out.println(user1.toString());
        System.out.println("***");

        System.out.println(user3.toString());
        System.out.println("Transfer 1000$ from user1 to user3:");
        bankSystem.transferMoney(user1,user3,1000);
        System.out.println(user1.toString());
        System.out.println(user3.toString());
        System.out.println("***");

        System.out.println("Paying salary to user1:");
        bankSystem.paySalary(user1);
        System.out.println(user1.toString());

    }
}
