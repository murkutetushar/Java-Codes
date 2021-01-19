public class Student{
    
    protected int studentId;
    protected String name;
    protected int departmentId;
    protected String gender;
    protected String phone;
    
    public int getStudentId(){
        return studentId;
    }
    public void setStudentId(int _studentId){
        this.studentId = _studentId;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String _name){
        this.name = _name;
    }
    
    public int getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentId(int _departmentId){
        this.departmentId = _departmentId;
    }
    
    public String getGender(){
        return gender;
    }
    public void setGender(String _gender){
        this.gender = _gender;
    }
    
    public String getPhone(){
        return phone;
    }
    public void setPhone(String _phone){
        this.phone = _phone;
    }
}
