package Task2;

//1.3 create a class Account with data member as balance .create two constructors(no arguments,with arguments) and perfrom follwing task
//a. Method to deposit amount
//b. Method to withdraw the amount
//c. Method to display balance

public class Account {

    private double balance;

    //no argument constructor
    public Account() {
    }

    //Parameterized constructor
    public Account(double balance) {
        this.balance = balance;
    }

    //Method to deposit amount in account
    public void depositAmount(double amount)
    {
        balance=balance+amount;
        System.out.println("Amount credited succesfully and current balance is:"+balance);
    }

    //Method to withdraw the amount from balance
    public void withdrawAmount(double amount)
    {
        if(balance >= amount)
        {
            balance=balance-amount;
            System.out.println("Amount debited succesfully and current balance is:"+balance);
        }
        else {
            System.out.println(" You don't have enough balance to withdraw!!!");
        }
    }

    //Method to display the account balance
    public void displayBalance()
    {
        System.out.println("current balance in your account "+this.balance);
    }

    //Main method to invoke the function
    public static void main(String[] args)
    {

        Account acc=new Account();
        acc.depositAmount(19000.98);
        //acc.withdrawAmount(4530);
        acc.withdrawAmount(9063242.00);
        acc.displayBalance();
    }
}
