package module3.task4;

/**
 * Create User class with the following fields: String name, int balance, int monthsOfEmployment, String companyName,
 * int salary, String currency.
 * <p>
 * Create getters and setters and constructor with all fileds.
 * <p>
 * Write methods:
 * <p>
 * void paySalary() -  that add salary to the balance of the user
 * withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
 * companyNameLength - calculates length of the company name
 * monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
 */

public class User {
    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    //void paySalary() -  that add salary to the balance of the user
    public void paySalary() {
        this.balance += this.salary;
    }

    //withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
    public int withdraw(int summ) {
        double commission;
        if (summ < 1000) {
            commission = 1.05;
        } else {
            commission = 1.1;
        }

        if ((this.balance - (int) (summ * commission)) >= 0) {
            this.balance -= (int) (summ * commission);
            return this.balance;
        }
        return -1;
    }

    //companyNameLength - calculates length of the company name
    public int companyNameLength() {
        return this.companyName.length();
    }

    //monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
    public void monthIncreaser(int addMonth) {
        this.monthOfEmployment += addMonth;
    }
}
