public void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BankService bankService = new BankService();
    boolean running = true;
    while (running) {
        System.out.println("\n========== BANKING SYSTEM ==========");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Account Details");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");


        int choice = sc.nextInt();

    switch (choice) {
        case 1:
            bankService.createCustomer(sc);
            break;
        case 2:
            bankService.deposit(sc);
            break;
        case 3:
            bankService.withdraw(sc);
            break;
        case 4:
            bankService.checkBalance();
            break;
        case 5:
            bankService.showAccountDetails();
            break;
        case 6:
            running = false;
            System.out.println("Thank you for using the banking system.");
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}
    sc.close();
    }





