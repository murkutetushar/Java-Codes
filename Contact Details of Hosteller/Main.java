import java.util.Scanner;

public class Main{
     
    public static Hosteller getHostellerDetails(){
        Hosteller h = new Hosteller();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hostel Name");
        h.setHostelName(sc.nextLine());
        
        System.out.println("Room Number");
        h.setRoomNumber(Integer.parseInt(sc.nextLine()));
        
        
        
        System.out.println("Modify Room Number(Y/N)");
        String ch = sc.nextLine();
        if(ch.equalsIgnoreCase("y")){
        System.out.println("New Room Number");
        h.setRoomNumber(Integer.parseInt(sc.nextLine()));  
        }
        
        System.out.println("Modify Phone Number(Y/N)");
        String ch1 = sc.nextLine();
        if(ch1.equalsIgnoreCase("y")){
        System.out.println("New Room Number");
        h.setPhone(sc.nextLine());
        }
        return h;
    }
    
    public static void main(String args[]){
       // Main main = new Main();
       Scanner sc = new Scanner(System.in); 
      Hosteller h1 = new Hosteller();
        
       
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        h1.setStudentId(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Student Name");
        h1.setName(sc.nextLine());
        
        System.out.println("Department Id");
        h1.setDepartmentId(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Gender");
        h1.setGender(sc.nextLine());
        
        System.out.println("Phone Number");
        h1.setPhone(sc.nextLine());
             
        h1=  Main.getHostellerDetails();         
        
    }
}
