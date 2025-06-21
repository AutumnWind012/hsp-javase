package com.hspedu.P05_Encap;

public class AccountTest {
    public static void main(String[] args) {
        Account user = new Account("Sam", 50, "340012asd");
    }
}

class Account {
    private String name;
    private int balance;
    private String password;

    public Account() {}

    public Account(String name, int balance, String password) {
        this.setName(name);
        this.setBalance(balance);
        this.setPassword(password);
    }

    public void setName(String name) {
        if (name.length() > 4 || name.length() < 2) {
            System.out.println("姓名不合法");
            this.name = "tom";
        } else {
            this.name = name;
        }
    }

    public void setBalance(int balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额不足");
            this.balance = 100;
        }
    }

    public void setPassword(String password) {
        if (password.length() != 6) {
            System.out.println("密码必须是六位");
            this.password = "123456";
        } else {
            this.password = password;
        }
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getPassword() {
        return password;
    }
}
