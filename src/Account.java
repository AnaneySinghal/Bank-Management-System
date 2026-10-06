public class Account {
    private static long nextAccountNumber=10001;

    private long accountNumber;
    private double balance;
    private Customer customer;

    public Account(Customer customer){
        this.customer=customer;
        this.balance=0;
        this.accountNumber=nextAccountNumber++;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

   public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Current Balance: "+ balance);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else if(amount<=0){
            System.out.println("Invalid Amount");
        }
        else{
            balance-=amount;
            System.out.println("Amount Withdrawn Successfully");
            System.out.println("Remaining Balance: "+balance);
        }

    }
    public double checkBalance(){
        return balance;
    }

  public void accountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        customer.customerInformation();
    }


}
