import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class CarLot extends ArrayList<Car> {
	

	public CarLot() {
		 
	}
	
	public void addCar(String id, int mileage, int mpg, double cost, double salesPrice) {
		Car car = new Car(id, mileage, mpg, cost, salesPrice);
		super.add(car);
	}
	
	
	
	public Car findCarByIdentifier(String identifier) {
		for (Car car: this) {
			if (car.getId().equals(identifier)) {
				return car;
			}
			else {
				return null;
			}
		}
		return null;
	}
	
	public void sellCar(String identifier, double priceSold){
		try {
			for (Car car: this) {
				if (car.getId().equals(identifier)) {
					car.sellCar(priceSold);
				}
			}
		}
		catch(IllegalArgumentException ex) {
			System.out.printf("Car does not exist or has been sold", ex);
		}
	}
	
	public ArrayList<Car> getCarsInOrderOfEntry(){
		 return this;	
	}
		 
	public ArrayList<Car> getCarsSortedByMpg(){
		
		ArrayList<Car> sortedCars = new ArrayList<>();
		for (Car c : this) {
			sortedCars.add(c);
		}
		for (int i = 0; i < sortedCars.size() - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			Car currentMin = sortedCars.get(i);
			int currentMinIndex = i;

			for (int j = i + 1; j < sortedCars.size(); j++) {
				if(currentMin.compareMpg(sortedCars.get(j)) > 0) {
					currentMin = sortedCars.get(j);
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if necessary;
			if (currentMinIndex != i) {
				sortedCars.set(currentMinIndex, sortedCars.get(i));
				sortedCars.set(i, currentMin);
			}
		}
	
		
		return sortedCars;
		
	}
	
	public Car getCarwithBestMPG() {
		if (this.isEmpty()) {
			return null;
		}
		
		Car maxMpg = this.get(0);
		for(Car c: this) {
			int car1 = maxMpg.getMpg();
			int car2 = c.getMpg();
			if (car1 < car2) {
				maxMpg = c;
			}
		}
		return maxMpg;
	}
	
	public Car getCarWithHighestMileage() {
		if (this.isEmpty()) {
			return null;
		}
		
		Car maxMiles = this.get(0);
		for(Car c: this) {
			int car1 = maxMiles.getMileage();
			int car2 = c.getMileage();
			if (car1 < car2) {
				maxMiles = c;
				}
			}
					
		return maxMiles;
	
	}
	
	public double getAverageMpg() {
		double averageMpg = 0.0;
		for(Car c: this) {
			double carMpg = c.getMpg();
			averageMpg += (carMpg) / this.size();
			
		}
		return averageMpg;
	}
	
	public double getTotalProfit() {
		double profit = 0.0;
		for(Car c: this) {
			if(c.isSold()) {
				profit += c.getProfit();
			}
		}
		return profit;
		 
	}
	
	
	//Enhancement 1: Returns the cheapest car in the inventory in case client is looking for cheapest vehicle.
	public Car getCheapestCar() {
		if (this.isEmpty()) {
			return null;
		}
		
		Car cheapestCar = this.get(0);
		for(Car c: this) {
			double car1 = cheapestCar.getSalesPrice();
			double car2 = c.getSalesPrice();
			
			if (car1 > car2) {
				cheapestCar = c;
			}
			
		}
		return cheapestCar;
	}
	
	//Enhancement 2: Returns the preferred car brand of the client.
	public Car preferedCar(String favoriteBrand) {
		return this.findCarByIdentifier(favoriteBrand);
	}
	
	
	//Enhancement 3: Returns cars in client's desirable price range
	public ArrayList<Car> priceRange(double minPrice, double maxPrice) {
		
		ArrayList<Car> carsInRange = new ArrayList<Car>();
		
		for(Car c: this) {
			if (c.getSalesPrice() >= minPrice & c.getSalesPrice() <= maxPrice) {
				carsInRange.add(c);
			}
		}
		return carsInRange;
		
	}
	
	public void saveToDisk() throws FileNotFoundException {
		File file = new File("carlot.txt");
		if(file.exists()) {
			System.exit(0);
		}
		PrintWriter data = new PrintWriter(file);
		
		for(Car c: this) {
			data.println(c.getId() + ", " + c.getMileage() + ", " + c.getMpg() +"," + c.getCost() + ", " + c.getSalesPrice() + ", " + c.getPriceSold() + ", " + c.getProfit() + ", " + c.isSold());
		}
		
		data.close();
	}
	
	public void loadFromDisk() throws FileNotFoundException {
		File file = new File("carlot.txt");
		
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			String data = input.next();
			System.out.println(data);
		}
		input.close();
		
	}
	
}
