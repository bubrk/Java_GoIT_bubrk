package module4.task3;

import module4.task1.Bank;
import module4.task2.Currency;

/**
 * ******************************************************************
 * ЗАДАНИЕ 3
 * ******************************************************************
 * USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 * limit of funding - 10000 if EUR and no limit if USD
 * monthly rate - 1% with USD and 1.5% with EUR
 * commision - 5% if USD and up to 1000, 7% if USD and more than 1000
 * 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);

    }


    @Override
    public int getLimitOfWithdrawal() {
        switch (super.getCurrency()) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
            default:
                return -1;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (super.getCurrency()) {
            case USD:
                return 0;
            case EUR:
                return 10000;
            default:
                return -1;
        }
    }

    @Override
    public double getMonthlyRate() {
        switch (super.getCurrency()) {
            case USD:
                return 1;
            case EUR:
                return 1.5;
            default:
                return -1;
        }
    }

    @Override
    public int getCommission(double amount) {
        switch (super.getCurrency()) {
            case USD:
                return (amount <= 1000) ? 5 : 7;
            case EUR:
                return (amount <= 1000) ? 6 : 8;
            default:
                return -1;
        }
    }

}
