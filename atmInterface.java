import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;

class banking{

    double balance;

     banking(double initialBalance)
      {
        this.balance = initialBalance;
    }
    void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("YOUR AMOUNT Rs"+amount+"HAS BEEN SUCCESSFULLY DEPOSITED");
        }
        else
        {
            System.out.println("PLEASE ENTER A VALID AMOUNT");
        }
    }
    void withdrawal(double amount)
    {
        if(amount<=0)
        {
            System.out.println("YOU HAVE ENTERED INVALID AMOUNT TO WITHDRAW");
        }
        else if(amount>balance)
        {
            System.out.println("INVALID AMOUNT IS ENTERED TO WITHDRAW");
        }
        else 
        {
            balance-=amount;
            System.out.println("Rs"+amount+" has been withdraw successfully");
        }
    }
    void checkbal()
    {
        System.out.println("Current Balance "+balance);
    }
}
class atm 
{
    private banking account;
    private Scanner sc;

    public atm(banking account) 
    {
        this.account = account;
        this.sc = new Scanner(System.in);
    }

    void showmenu()
    {
        int choice;
        do
        {
            System.out.println("***********************");
            System.out.println("options are");
            System.out.println("1.check balance");
            System.out.println("2.deposit");
            System.out.println("3.withdrawal");
            System.out.println("4.exit");
            System.out.println("enter ur choice");
            choice=sc.nextInt();

             switch (choice)
              {
                case 1:
                    account.checkbal();
                    break;
                case 2:
                    handledeposit();
                    break;
                case 3:
                    handlewithdrawal();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
             }
        }
        while(choice!=4);
    }
    private void handledeposit()
    {
        System.out.println("enter the amount to deposit");
        double amount=sc.nextDouble();
        account.deposit(amount);
    }
    private void handlewithdrawal()
    {
        System.out.println("enter the amount u want to withdraw");
        double amount=sc.nextDouble();
        account.withdrawal(amount);
    }
      
}
class atminterface
{
    public static void main(String[] args)
     {
        banking userAccount = new banking(1000.00);

        // Create the ATM with the user's account
        atm atm = new atm(userAccount);

        // Display the ATM menu
        atm.showmenu();
    }
}