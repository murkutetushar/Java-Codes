public class Account{
      private int accountId;
       private String accountType;
       private int balance;
   
     public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
       
   
    
    
    public boolean withdraw(int withdrawAmt){
        int balance = getBalance();
        if(balance > withdrawAmt){
            int currentBalance = balance - withdrawAmt;
            setBalance(currentBalance);
            System.out.println("Balance amount after withdraw: :"+currentBalance);
        }else{
            System.out.println("Sorry!!! No enough balance");
             return false;
        }
        
        return true;
   
}
}
