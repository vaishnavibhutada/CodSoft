import java.util.Scanner;

class BankAccount{
    private double Balance;

    public BankAccount(double Balance){
    this.Balance=Balance;
     }
   public double getBalance(){
    return Balance;

   }
   public void depositAmount(double depositAmount){
    Balance+=depositAmount;

   }
   public void withdrawAmount(double withdrawAmount){
    if(withdrawAmount<= Balance)
    {
        Balance-=withdrawAmount;
    }
    else{
        System.out.println("Insufficient Balance");
     }
   }

}
class ATM{
    private BankAccount account;


    public ATM( BankAccount account){
        this.account=account;
    }

    public void Menu(){
        System.out.println("Welcome to Bank ATM ");
        System.out.println();
        System.out.println("1. Deposit ");
        System.out.println("2.Withdraw ");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        System.out.println();

    }
    public void userChoice(){
        Scanner s =new Scanner(System.in);
        int choice;
       do{
            Menu();
            System.out.print("Enter your choice (1-4): ");
            choice = s.nextInt();
    
        switch(choice)
        {
            case 1: 
            System.out.println("you Chose to Deposite Money ");
             System.out.println("Enter amount to be Deposited: ");
             double depositAmount=s.nextDouble();
             account.depositAmount(depositAmount);
             System.out.println("Money Deposited Successfully ");
             System.out.println("New balance "+account.getBalance()+"\n");
             System.out.println();
             break;
        case 2: 
             System.out.println("you Chose to WithdrawMoney ");
             System.out.println("Enter amount to be Withdraw: ");
            double withdrawAmount=s.nextDouble();
             account.withdrawAmount(withdrawAmount);
             System.out.println("Money Withdraw Successfully ");
             System.out.println("New balance "+account.getBalance()+"\n");
             System.out.println();
             break;
        case 3: 
             System.out.println("you Chose to check Balance ");
            
             System.out.println("Current  balance "+account.getBalance()+"\n");
             System.out.println();
             break;
        case 4:
        System.out.println("Thank You for visiting our ATM");
       
        System.out.println();
         System.exit(0);
        break;
            default:
            System.out.println("Invalid choice .Please choice correct choice");
            System.out.println();
                
        }
    } while (choice != 4);
    s.close();
    }
       
 }   
public class ATM_Interface{
   

    public static void main(String[] args) {
      
    
        BankAccount userAccount =new BankAccount(1400);
        ATM a =new ATM(userAccount);
        a.userChoice();

     
    }
}