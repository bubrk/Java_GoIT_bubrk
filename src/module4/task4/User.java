package module4.task4;

import module4.task1.Bank;

/**
 *******************************************************************
 ЗАДАНИЕ 4
 *******************************************************************
 User should have following fields:

 long id
 String name
 double balance
 int monthOfEmployment
 String companyName
 int salary
 Bank bank

 User does not have its own methods. But overrides toString method.
 */
public class User {
    private long id;
    private String name;
    private double balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private Bank bank;

    public User(long id, String name, double balance, int monthOfEmployment, String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
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

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return String.format("User Id: %d | " +
                "Name: %s | " +
                "Balance: %.2f | " +
                "Month of employment: %d | " +
                "Company name: %s | " +
                "Salary: %d | " +
                "Bank id: %d",
                id,name,balance,monthOfEmployment,companyName,salary, bank.getId());
    }
}
