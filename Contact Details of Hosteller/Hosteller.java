import java.util.Scanner;

public class Hosteller extends Student{
    
   private String hostelName;
    private int roomNumber;
    
    public String getHostelName(){
        return hostelName;
    }
    public void setHostelName(String _hostelName){
        this.hostelName = _hostelName;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public void setRoomNumber(int _roomNumber){
        this.roomNumber = _roomNumber;
    }
}
