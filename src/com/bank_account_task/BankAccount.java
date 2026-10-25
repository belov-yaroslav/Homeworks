package com.bank_account_task;


public class BankAccount {
    private final String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        if(balance >= 0){
            System.out.println("Счёт создан");
            this.owner = owner;
            this.balance = balance;

        }
        else{
            this.owner = owner;
            this.balance = 0;
            System.out.println("Введена некорректная сумма денег");
            System.out.println("Сумма денег должна быть не отрицательной");
        }

    }

    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Введена не корректная сумма денег");
            System.out.println("Сумма денег должна быть не отрицательной");
        }

        else{
            System.out.println("Баланс пополнен");
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount < 0) {
            System.out.println("Введена не корректная сумма денег");
            System.out.println("Сумма денег должна быть не отрицательной");
            return;
        }

        if(amount <= balance){
            System.out.println("Снятие произведено");
            balance -= amount;
        }

        else{
            System.out.println("Не достаточно средств для снятия");
        }
    }

    public String getOwner(){
        return owner;
    }

    public double getBalance(){
        return balance;
    }
}
