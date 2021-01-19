
public class Vehicle implements Loan,Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	
	public double issueLoan(){
        double loanAmount;
	    String vehicleT = getVehicleType();
	    if(vehicleT.equals("4 wheeler")){
	        loanAmount = (getPrice() * 80)/100;
	        return loanAmount;
	    }else if(vehicleT.equals("3 wheeler")){
	        loanAmount = (getPrice() * 75)/100;
	        return loanAmount;
	    }else{
	        loanAmount = (getPrice() * 50)/100;
	        return loanAmount;
	    }
	}
	
	public double takeInsurance(){
	    double pricee = getPrice();
	    int insuraceAmount;
	    if(pricee <= 150000){
	        insuraceAmount = 3500;
	        return insuraceAmount;
	    }else if(300000 >= pricee && price > 150000){
	        insuraceAmount = 4000;
	        return insuraceAmount;
	    }else{
	        insuraceAmount = 5000;
	        return insuraceAmount;
	    }
	}

}
