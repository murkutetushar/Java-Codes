import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       Vehicle v;
       System.out.println("Enter vehicle number:");
       String vehicleNumber = sc.nextLine();
       
       System.out.println("Enter model name:");
       String modelName = sc.nextLine();
       
       System.out.println("Enter vehicle type:");
       String vehicleType = sc.nextLine();
      
       System.out.println("Enter price:");
       double price =  Double.parseDouble(sc.nextLine());
       
       v = new Vehicle(vehicleNumber,modelName,vehicleType,price);
       double loan = v.issueLoan();
       double insurance = v.takeInsurance();
       System.out.println(loan);
       System.out.println(insurance);
       /*
       this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;*/
    }
}
