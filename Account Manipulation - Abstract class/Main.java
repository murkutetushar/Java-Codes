import java.util.Scanner;
public class Main{
    
    public static void main(String args[]){
        
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int empId = Integer.parseInt(sc.nextLine());
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter email Id");
		String emaild = sc.nextLine(); 
		System.out.println("Enter Account Number");
		int accountNumber = Integer.parseInt(sc.nextLine());
		System.out.println("Enter balance");
		double balance = Double.parseDouble(sc.nextLine()); 
		System.out.println("Enter minimum balance");
		double minBalance = Double.parseDouble(sc.nextLine());  
		System.out.println("Enter Amount to withdraw");
		double amount = Double.parseDouble(sc.nextLine());  
		
		
		Customer c = new Customer(empId,name,emaild);
		Account a;
		a = new SavingsAccount(accountNumber, c, balance, minBalance);
		a.withdraw(amount);
    }
}
