package com.hspedu.P13_HW.q8;

public class Homework08 {

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000);
        account.deposit(100);
        account.deposit(100);
        account.deposit(100);
        account.showBalance();
        account.deposit(100);
        account.showBalance();
        account.earnMonthlyInterest();
        account.showBalance();
        account.withdraw(100);
        account.showBalance();
    }
}

class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
    public void showBalance() {
        System.out.println("账户余额：" + balance);
    }
}


class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }
    @Override
    public void deposit(double amount) {
        System.out.println("收取手续费");
        super.deposit(amount - 1);
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("收取手续费");
        super.withdraw(amount + 1);
    }
}

class SavingsAccount extends BankAccount {

    private int count = 3;
    private double rate = 0.01;

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        --count;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        --count;
    }

    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }
}