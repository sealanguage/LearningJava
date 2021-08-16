package com.company.abstraction;

public class CheckingAccount {
    private String id;
    private long balance;
    private String name;
    private String pin;

    public CheckingAccount (String id, long balance, String name, String pin) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.pin = pin;
    }
}
