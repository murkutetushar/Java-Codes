public class SavingsAccount extends Account{



    //Uncomment the getters and setters after writing the attributes

        private double minimumBalance;

	    public double getMinimumBalance() {
			return minimumBalance;
		}

		public void setMinimumBalance(double minimumBalance) {
			this.minimumBalance = minimumBalance;
		}
	    
	    public SavingsAccount(int accountNumber,Customer customerObj,double balance, double minimumBalance){
	    	super(accountNumber, customerObj, minimumBalance);
	        this.accountNumber = accountNumber;
	        this.customerObj = customerObj;
	        this.balance = balance;
	        this.minimumBalance = minimumBalance;
	    } 
	    
	    public boolean withdraw(double amount){
	        double balance = getBalance();
	        double minimumBalance = getMinimumBalance();
	        double newBalance;
	       if((balance - amount) > minimumBalance) {
	    	  newBalance = balance - amount;
	    	  setBalance(newBalance);
	    	  return true;
	       }else {
	    	   return false;
	       }
	    	   
	    	 
	    }
}

    
