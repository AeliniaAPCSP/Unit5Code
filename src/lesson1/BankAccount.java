package lesson1;

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
    public BankAccount(){
        balance = 0;
    }

    //overloaded constructor
    public BankAccount(double initialBalance){
        balance = initialBalance;
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

    @Override
    public String toString(){
        return String.format("Balance: $%.2f",balance);
    }
}


What I made:
package lesson1;

/**
 * Operations
 * Instance variables (it's proporties):
 * account number, balance, interest rate, bank name, owner name
 */

/**
 * Instructions on the board I didn't
 * do. I was sleeping. sorry.
 * 1) Make a new constuctor that takes name
 * as the perameter along with an initial balance
 * 2) For all constuctors, assign the account
 * number a random 8 digit number
 * 3) Make methods that allow someone to:
 * a) Change account owner
 * b) change interest rate
 * 4) Make an addInterest method that
 * adds x? of interest to the balance
 *
 * idk either. sorry you have to do this
 */

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double interestRate;
    private String bankName;
    private String owner;

    //constructors must have same name as class
    public BankAccount(){
        balance = 0;
    }

    //overloaded constructors
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    //setters (mutators)

    /**
     * Deposits a specified amount of money into the'
     * account
     * @param amount amount to deposit
     */
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    //getter
    public double getBalance(){

    }

    @Override
    public String toString(){
        return String.format("Balance: $%.2f" + balance);
    }
}
