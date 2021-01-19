
public class Loan {
	
	//Implement the below method 
	public double calculateLoanAmount(Employee employeeObj) {
		Employee e = employeeObj;
		
		if(e instanceof PermanentEmployee) {
			e.calculateSalary();
			double salary = e.getSalary();
			double loanAmount = (salary * 15)/100;
			return loanAmount;
		}else {
			e.calculateSalary();
			double temporarySalary = e.getSalary();
			double loanAmount1 = (temporarySalary * 10)/100;
			return loanAmount1;
		}
			
	}

}
