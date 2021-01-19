import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        	// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Id");
	        int id = Integer.parseInt(sc.nextLine());
	        System.out.println("Enter Name");
	        String name = sc.nextLine();
	        System.out.println("Enter basic pay");
	        double basicPay = Double.parseDouble(sc.nextLine());
	        System.out.println("Enter hours worked");
	        int hoursWorked = Integer.parseInt(sc.nextLine());
	        System.out.println("Enter hourly wages");
	        int hourlyWages = Integer.parseInt(sc.nextLine());
	       
	        Loan l = new Loan();
	        double loanAmount;
	        Employee e;
	        e = new PermanentEmployee(id,name,basicPay);
	        loanAmount = l.calculateLoanAmount(e);
	        System.out.println(loanAmount);
	        
	        e = new TemporaryEmployee(id,name,hoursWorked,hourlyWages);        
	       loanAmount=l.calculateLoanAmount(e);
	        System.out.println(loanAmount);
	        
	}
    
}
