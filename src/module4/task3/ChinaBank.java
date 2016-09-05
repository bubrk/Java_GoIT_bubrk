package module4.task3;

import module4.task1.Bank;
import module4.task2.Currency;

/**
 ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
 limit of funding - 5000 if EUR and 10000 if USD
 monthly rate - 1% with USD and 0% with EUR
 commision - 3% if USD and up to 1000, 5% if USD and more than 1000
 10% if EUR and up to 1000 and 11% if EUR and more than 1000
 */
public class ChinaBank extends Bank{

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        switch (super.getCurrency()) {
            case USD:
                return 100;
            case EUR:
                return 150;
            default:
                return -1;
        }
    }

    @Override
    public int getLimitOfFunding() {
        switch (super.getCurrency()) {
            case USD:
                return 10000;
            case EUR:
                return 5000;
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
                return 0;
            default:
                return -1;
        }
    }

    @Override
    public int getCommission(double amount) {
        switch (super.getCurrency()) {
            case USD:
                return (amount <= 1000) ? 3 : 5;
            case EUR:
                return (amount <= 1000) ? 10 : 11;
            default:
                return -1;
        }
    }

}
