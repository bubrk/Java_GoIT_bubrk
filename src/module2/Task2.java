package module2;

import java.util.Arrays;

/**
 * This is homework for Module 2 of JavaCore course.
 * Here are tasks 2.1, 2.2 and 2.3
 */

public class Task2 {

    private static double[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    //private static int[] balances1 = {200, 200, 500, 4000, 30};

/* Something from practical lesson

    static int balancesSum(double[] balances) {
        int sum = 0;
        for (double balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(double[] balances, String[] names) {
        int ownersCount = 0;
        for (double balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }

        return result;
    }
 */


    //HOMEWORK 2.1
    // Write method which withdraw money from account and takes commision 5% of the transaction. Print OK + commision
    // + balance after withdrawal. Print NO is withdrawal is not possible
    public static double withdrawBalance(double balance, double withdrawal) {

        if ((balance - withdrawal * 1.05) >= 0) {
            balance = balance - withdrawal * 1.05;
            System.out.println(String.format("OK %.2f %.2f", withdrawal * 0.05, balance));
        } else
            System.out.println("NO");

        return balance;
    }

    //HOMEWORK 2.2
    //You need to write method which withdraw money of particular account owner if he/she can. Print name + NO of
    // withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case. Commision is
    // 5% for all cases.
    public static double withdrawBalance(String ownerName, double withdrawal) {

        int ownerIndex;

        ownerIndex = Arrays.asList(ownerNames).indexOf(ownerName);

        if (ownerIndex == -1) {
            System.out.println(ownerName + " NO");
            return -1;
        } else {
            if ((balances[ownerIndex] - withdrawal * 1.05) >= 0) {
                balances[ownerIndex] = balances[ownerIndex] - withdrawal * 1.05;
                System.out.println(String.format("%s %.2f %.2f", ownerName, withdrawal, balances[ownerIndex]));
                return balances[ownerIndex];
            } else {
                System.out.println(ownerName + " NO");
                return balances[ownerIndex];
            }

        }

        //return 0;
    }

    //HOMEWORK 2.3
    //You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding
    public static double fundBalance(String ownerName, double fund) {
        int ownerIndex;

        ownerIndex = Arrays.asList(ownerNames).indexOf(ownerName);

        if (ownerIndex == -1) {
            System.out.println(ownerName + " not found");
            return -1;
        } else {
            balances[ownerIndex] += (int) fund;
            System.out.println(String.format("%s %.2f", ownerName, balances[ownerIndex]));
            return balances[ownerIndex];
        }

    }


    public static void main(String[] args) {


        withdrawBalance(250, 245);
        withdrawBalance(450, 50);

        System.out.println(Arrays.toString(ownerNames));
        System.out.println(Arrays.toString(balances));

        withdrawBalance("Jack", 40);
        withdrawBalance("Jim", 10);
        withdrawBalance("Ann", 245);
        fundBalance("Ann", 40);
        withdrawBalance("Ann", 245);


    }
}
