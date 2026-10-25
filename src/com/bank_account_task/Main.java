package com.bank_account_task;

public class Main {
    public static void main(String[] args){
        BankAccount Sasha = new BankAccount("Sasha", 100);
        System.out.println(Sasha.getOwner());
        System.out.println(Sasha.getBalance());
        Sasha.deposit(100);
        System.out.println(Sasha.getBalance());
        Sasha.withdraw(150.6);
        System.out.println(Sasha.getBalance());
        Sasha.withdraw(150.6);
        System.out.println(Sasha.getBalance());
        Sasha.withdraw(0);
        System.out.println(Sasha.getBalance());



    }
}
