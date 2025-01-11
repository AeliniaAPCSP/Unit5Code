package lesson1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("John", 50);
        System.out.println(myAccount.toString());
        myAccount.deposit(10);
        System.out.println(myAccount.toString());
        myAccount.withdraw(30);
        System.out.println(myAccount.toString());
        myAccount.changeInterest(.04);
        myAccount.addInterest();
        System.out.println(myAccount.toString());
        System.out.println(myAccount.getAccountNumber());
        myAccount.changeOwner("John 2.0");
        System.out.println(myAccount.getOwner());
    }
}
