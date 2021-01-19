import java.util.Scanner;

public class StudentMain{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      
        String collegeName = "";
        String ch = "";
        System.out.println("Enter Student's Id:");
        int studentId = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Student's Name:");
        String studentName = sc.nextLine();
        System.out.println("Enter Student's Address:");
        String studentAdd = sc.nextLine();
         do{
             System.out.println("Whether the student is from NIT(Yes/No):");
             ch = sc.next();
             if(!(ch.equalsIgnoreCase("yes")||ch.equalsIgnoreCase("no"))){
                 System.out.println("Wrong Input");
             }
         }while(!(ch.equalsIgnoreCase("yes")||ch.equalsIgnoreCase("no")));
         
      
        sc.nextLine();
        if(ch.equalsIgnoreCase("yes")){
            
             Student student = new Student(studentId,studentName,studentAdd);
             System.out.println("Student id:"+student.getStudentId()+"\nStudent name:"+student.getStudentName()+"\nAddress:"+student.getStudentAddress()+"\nCollege name:"+student.getCollegeName());
        }else{
            System.out.println("Enter your college name:");
            collegeName = sc.nextLine();
            Student student = new Student(studentId,studentName,studentAdd,collegeName);
            System.out.println("Student id:"+student.getStudentId()+"\nStudent name:"+student.getStudentName()+"\nAddress:"+student.getStudentAddress()+"\nCollege name:"+student.getCollegeName());
        
        }
    }
}
