public class Student{
    
   
    private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;
    
    public Student(int studentIdd,String StudentNa,String studentAdd){
        this.studentId = studentIdd;
        this.studentName = StudentNa;
        this.studentAddress = studentAdd;
        this.collegeName = "NIT";
    }
    public Student(int studentId,String studentNa,String StudentAdd,String collegeNa){
        this.studentId = studentId;
        this.studentName = studentNa;
        this.studentAddress = StudentAdd;
        this.collegeName = collegeNa;
    }
    
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
   
    public String getStudentAddress(){
        return studentAddress;
    }
    
    public String getCollegeName(){
        return collegeName;
    }
 
    
    
}
