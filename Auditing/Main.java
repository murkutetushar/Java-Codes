import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map <String,Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
		ArrayList<String> name= new ArrayList<>();
		// Fill the code
		EmployeeAudit ea = (sal) -> {
		    for(String key : employeeMap.keySet()){
		        if(employeeMap.get(key) <= sal){
		            name.add(key);
		        }
		    }
		    return name;
		};
		return ea;
	}
	
	public static void main(String[] args)
	{
		Main m1 = new Main();
		Scanner sc=new Scanner(System.in);
        int ch=0;
        do{
            System.out.println("1.Add Employee Details \n2.Find Employee Details \n3.Exit");
           System.out.println("Enter the choice");
            ch = sc.nextInt();
            sc.nextLine();
            switch(ch){
                
                case 1:
                    System.out.println("Enter the Employee name");
                    String name = sc.nextLine();
                    System.out.println("Enter the Employee Salary");
                    double salary = Double.parseDouble(sc.nextLine());
                    m1.addEmployeeDetails(name,salary);
                    break;
                    
                case 2:
                    System.out.println("Enter the salary to be searched");
                    double salary1 = Double.parseDouble(sc.nextLine());
                    ArrayList<String> list = new ArrayList<>();
                    list = m1.findEmployee().fetchEmployeeDetails(salary1);
                    if(list.isEmpty()) {
        				System.out.println("No Employee Found");
        			}
        			else {
        				System.out.println("Employee List");
        				for(String name1:list) {
        					System.out.println(name1);
        				}
        			}
                    break;
                    
                case 3: 
                    System.out.println("Let's complete the session");
                    break;    
            }
        }while(ch != 3);
		
	}

}
