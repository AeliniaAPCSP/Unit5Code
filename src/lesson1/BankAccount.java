package lesson1;

import java.util.Random;
/**
 * Operations: deposit money, withdraw money, get current balance
 * Instance variables (what makes a bank account, it's properties):
 * account number, balance, interest rate, bank, owner
 */

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double interestRate;
    private String bank;
    private String owner;

    //constructors must have same name as class
    public BankAccount(String ownerName){
        balance = 0;
        owner = ownerName;
        interestRate = .02;
        accountNumber = Integer.toString((int) (Math.random()*100000000)); //creates accountNumebr
        while(accountNumber.length() < 8){ //makes account number 8 digits if it isn't
            accountNumber = "0" + accountNumber;
        }

    }

    //overloaded constructor
    public BankAccount(String ownerName, double initialBalance){
        balance = initialBalance;
        owner = ownerName;
        interestRate = .02;
        accountNumber = Integer.toString((int) (Math.random()*100000000));
        while(accountNumber.length() < 8){
            accountNumber = "0" + accountNumber;
        }
    }

    //setters (mutators)

    /**
     * Deposits a specified amount of money into the
     * account
     * @param amount amount to deposit
     */
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    //getter (accessor)
    public double getBalance(){
        return balance;
    }

    //getter (accessor)
    public String getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString(){
        return String.format("Balance: $%.2f", balance);
    }

    public void changeOwner(String newOwner){
        owner = newOwner;
    }
    
    public void changeInterest(double newRate){
        interestRate = newRate;
    }

    public void addInterest(){
        balance *= (1+interestRate);
    }

    public String getOwner(){
        return owner;
    }
}
