
public class Car {
	
	//Instance variables
	private String id;
	private int mileage;
	private int mpg;
	private double cost;
	private double salesPrice;
	private boolean sold;
	private double priceSold;
	private double profit;
	
	//Default constructor
	public Car(){
		
	}
	
	// Constructor to add new car
	public Car(String id, int mileage, int mpg, double cost, double salesPrice){
		this.id = id;
		this.mileage = mileage;
		this.mpg = mpg;
		this.cost = cost;
		this.salesPrice = salesPrice;
	}
	
	//Accessors:
	
		//Getters
	public String getId() {
		return id;
	}
	public int getMileage() {
		return mileage;
		
	}
	public int getMpg() {
		return mpg;
	}
	public double getCost() {
		return cost;
	}
	public double getSalesPrice() {
		return salesPrice;
	}
	public boolean isSold() {
		this.sold = true;
		return sold;
	}
	public double getPriceSold() {
		return priceSold;
	}
	public double getProfit() {
		return profit;
	}
	
	// String method to return string representation
	public String toString() {
		return "Car: " + id + ", Mileage: " + mileage + ", MPG " + mpg + ", Sold: " + sold + ", Cost: $" + cost + ", Selling Price: " + salesPrice + ", Sold for $" + priceSold + ", Profit: $" + profit; 
	}
	
	// Comparison methods: 
	public int compareMpg(Car otherCar) {
		int result = 0;
		if (this.getMpg() < otherCar.getMpg()) {
			result = -5;
		}
		else if (getMpg() > otherCar.getMpg()) {
			result = 5;
		}
		else if (getMpg() == otherCar.getMpg()) {
			result = 0;
		}
		return result;
		
	}
	
	public int compareMiles(Car otherCar) {
		int result = 0;
		Car car = new Car(id, mileage, mpg, cost, salesPrice);
		if (car.getMileage() < otherCar.getMileage()) {
			result = -6;
		}
		else if (car.getMileage() > otherCar.getMileage()) {
			result = 6;
		}
		else if (car.getMileage() == otherCar.getMileage()) {
			result = 0;
		}
		return result;
		 
	}
	
	public double compareSalesPrice(Car otherCar) {
		int result = 0;
		Car car = new Car(id, mileage, mpg, cost, salesPrice);
		if (car.getSalesPrice() < otherCar.getSalesPrice()) {
			result = -7;
		}
		else if (car.getSalesPrice() > otherCar.getSalesPrice()) {
			result = 7;
		}
		else if (car.getSalesPrice() == otherCar.getSalesPrice()) {
			result = 0;
		}
		return result;
		
	}
	
	// Mutators
		//Setters
	public void setId(String id) {
		this.id = id;
			
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
				
	} 
	
	public void setMpg(int mpg) {
		this.mpg = mpg;
			
	}
	
	public void setCost(double cost) {
		this.cost = cost;
			
	}
	
	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
			
	}
	
	public void setSold(boolean sold) {
		this.sold = sold;
			
	}
	public void setPriceSold(double priceSold) {
		this.priceSold = priceSold;
			
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	
	// SellCar method.
	public void sellCar(double priceSold) {
		this.sold = true;
		this.priceSold = priceSold;
		this.profit = priceSold - cost;
		
	} 

}
