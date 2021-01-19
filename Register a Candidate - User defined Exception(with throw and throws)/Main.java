import java.util.Scanner;
public class Main{
   public static Candidate getCandidateDetails() throws InvalidSalaryException{
		Candidate cd =new Candidate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the candidate Details");
		System.out.println("Name");
		String name = sc.nextLine();
		cd.setName(name);
		System.out.println("Gender");
		String gender = sc.nextLine();
		cd.setGender(gender);
		System.out.println("Expected salary");
		double expectedSalary = Double.parseDouble(sc.nextLine());
		cd.setExpectedSalary(expectedSalary);
		
		 double salary = cd.getExpectedSalary();
		 if(salary < 10000) {
			 System.out.println(salary);
			 throw new InvalidSalaryException("Registration Failed");
		 }else {
			 
			 System.out.println("Registration Successfull");
		 return cd;
		 }
		
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Candidate cd = new Candidate();
		
		//cd.setExpectedSalary(expectedSalary);
		try {
			getCandidateDetails();
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
