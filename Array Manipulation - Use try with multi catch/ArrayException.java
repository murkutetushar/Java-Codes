import java.util.*;

public class ArrayException{
    public String getPriceDetails() {
		Scanner sc =new Scanner(System.in);
		int index=0;
		int element =0;
		System.out.println("Enter the number of elements in the array");
		int size = Integer.parseInt(sc.nextLine());
		int[] arr = new int[size];
		
		try {
		System.out.println("Enter the price details");
		for(int i=0; i <arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		System.out.println("Enter the index of the array element you want to access");
		index = Integer.parseInt(sc.nextLine());
		element=arr[index];
		}catch (ArrayIndexOutOfBoundsException e) {
			String line = "Array index is out of range";
			return line;
		}catch (NumberFormatException e) {
			String line = "Input was not in the correct format";
			return line;
		}
		
		String line = "The array element is "+element;
		return line;
	}
	public static void main(String[] args) {
		ArrayException tm = new ArrayException();
		String line = tm.getPriceDetails();
		System.out.println(line);
		// TODO Auto-generated method stub
		
	}

}
