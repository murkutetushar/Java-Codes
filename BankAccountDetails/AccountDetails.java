import java.util.Scanner;

public class AccountDetails{
    
    Scanner sc = new Scanner(System.in);
   
    public Account getAccountDetails(){
        Account ac = new Account();
        int balance;
        System.out.println("Enter account id:");
        ac.setAccountId(Integer.parseInt(sc.nextLine()));
        System.out.println("Enter account type:");
        ac.setAccountType(sc.nextLine());
       do{
        System.out.println("Enter balance");
        balance = Integer.parseInt(sc.nextLine());
        ac.setBalance(balance);
        if(balance<=0){
            System.out.println("Balance should be positive"); 
           
        }
      }while(balance <= 0);
        return ac;
    }
    
    public int getWithdrawAmount(){
      int balance;
        do{
        System.out.println("Enter amount to be withdrawn:");
        balance = Integer.parseInt(sc.nextLine());
        if(balance<=0){
            System.out.println("Amount should be positive"); 
           
        }
      }while(balance <= 0); 
        return balance;
    }
    
    public static void main(String args[]){
        AccountDetails ad = new AccountDetails();
        Account ac = new Account();
         ac = ad.getAccountDetails();
         int amount = ad.getWithdrawAmount();
         ac.withdraw(amount);
        
    }
}
