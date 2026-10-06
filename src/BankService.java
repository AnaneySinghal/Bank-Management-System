import java.util.Scanner;

public class BankService {
    private Account account;
    public void createCustomer(Scanner sc){
        if(account!=null){
            System.out.println("Account already exists");
            return;
        }
        else{
            System.out.println("Enter Customer ID");
            int customerId = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Customer Name");
            String name = sc.nextLine();
            System.out.println();

            System.out.println("Enter Customer Email");
            String email =sc.nextLine();
            System.out.println();

            System.out.println("Enter Customer Phone");
            String phone=sc.nextLine();
            System.out.println();

            Customer customer = new Customer(customerId,name,email,phone);
            account =new Account(customer);

            System.out.println("\nAccount Created Successfully");
            System.out.println("Your account number is:"+account.getAccountNumber());


        }

    }
   public void deposit(Scanner sc) {
        if (account == null) {
            System.out.println("Please create an account first");
            return;
        }

        System.out.println("Enter amount to deposit:");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }
    public void withdraw(Scanner sc) {
        if (account == null) {
            System.out.println("Please create an account first");
            return;
        }

        System.out.println("Enter amount to withdraw:");
        double amount = sc.nextDouble();

        account.withdraw(amount);
    }
    public void checkBalance() {
        if (account == null) {
            System.out.println("Please create an account first");
            return;
        }

        System.out.println("Current Balance: " + account.checkBalance());
    }
    public void showAccountDetails() {
        if (account == null) {
            System.out.println("Please create an account first");
            return;
        }

        account.accountDetails();
    }

}
