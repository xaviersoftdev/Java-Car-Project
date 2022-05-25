import java.io.FileNotFoundException;
import java.util.*;
public class CarLotMain {

	public static void main(String[] args) throws FileNotFoundException {
		 
		Scanner input = new Scanner(System.in);
		
		CarLot car = new CarLot(); 
		
		System.out.println("[0] Exit \n[1] Add car \n[2] Sell car \n[3] List inventory \n[4] List inventory from lowest mpg to highest "
				+ "\n[5] Display car with best mpg \n[6] Display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
				+ "\n[9] Save data to file \n[10] Load data from file  \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
				+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
		
		int option = input.nextInt();
		
		while (option != 0) {
			if (option == 1) {
				System.out.print("Enter mileage: ");
			
				int mileage = input.nextInt();
				
				System.out.print("Enter MPG: ");
			
				int mpg = input.nextInt();
				
				System.out.print("Enter cost: ");
			
				double cost = input.nextDouble();
				
				System.out.print("Enter sales price: ");
			
				double salesPrice = input.nextDouble();
				
				System.out.print("Enter car ID: ");
			
				input.nextLine();
			
				String carId = input.nextLine();
			
				car.addCar(carId, mileage, mpg, cost, salesPrice);
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
						+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
						+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
						+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
			}
			else if (option == 2) {
	
				System.out.println("Enter price sold: ");
			
				double priceSold = input.nextDouble();
				
				System.out.print("Enter car ID: ");
			
				input.nextLine();
			
				String carId1 = input.nextLine();
			
				car.sellCar(carId1, priceSold);
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
					+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
					+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
					+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
			}
			else if(option == 3) {
				
				System.out.println("Cars in order of entry (from left to right): ");
				System.out.println(car.getCarsInOrderOfEntry() + "  ");
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
					+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
					+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
					+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
			}
			
			else if(option == 4) {
				System.out.println("Cars sorted by lowest to highest MPG: ");
				System.out.println(car.getCarsSortedByMpg() + "  ");
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
					+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
					+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
					+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
			}
			
			else if(option == 5) {
				System.out.println("Car with best MPG: ");
				System.out.println(car.getCarwithBestMPG()+ "  ");
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
				+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
				+ "\n[9] Save data to file \n[10] Load data from file  \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
				+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
			}
			
			else if(option == 6) {
				System.out.println("Car with highest mileage: ");
				System.out.println(car.getCarWithHighestMileage());
				
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
				+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
				+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
				+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
			
			}
			
			else if(option == 7) {
				System.out.println("Display average MPG ");
				System.out.println(car.getAverageMpg());
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
					+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
					+ "\n[9] Save data to file \n[10] Load data from file  \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
					+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
				
			}
			
			else if(option == 8) {
				System.out.println("Profit for all sold cars: ");
				System.out.println(car.getTotalProfit());
				
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
					+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
					+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
					+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
				
		option = input.nextInt();
			}
			
			else if(option == 9) {
				car.saveToDisk();
				
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
						+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
						+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
						+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
					
		option = input.nextInt();
				
			}
			
			else if(option == 10) {
				car.loadFromDisk();
				
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
						+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
						+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
						+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
					
		option = input.nextInt();
			}
			
			else if (option == 11) {
				System.out.println("Cheapest car is: ");
				System.out.println(car.getCheapestCar());
				
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
						+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
						+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand"
						+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
					
		option = input.nextInt();
			}
			
			else if (option == 12) {
				System.out.println("Please enter your favorite brand to check if is in inventory: ");
				input.nextLine();
				String favoriteCar = input.nextLine();
				System.out.println(car.preferedCar(favoriteCar));
				
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
						+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
						+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \n[12] To look for favorite brand "
						+ " \n[13] To look inventory by price range \n[12] To look for favorite brand"
						+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
					
		option = input.nextInt();
			}
			
			else if (option == 13) {
				System.out.println("Please enter min price: ");
				double minPrice = input.nextDouble();
				System.out.println("Please enter max value: ");
				double maxPrice = input.nextDouble();
				
				System.out.println("Cars in the price range are: ");
				System.out.println(car.priceRange(minPrice, maxPrice));
				
				
				
		System.out.println("[0] exit \n[1] add car \n[2] sell car \n[3] list inventory \n[4] list inventory from lowest mpg to highest "
						+ "\n[5] display car with best mpg \n[6] display car with highest mileage \n[7] Display overall MPG \n[8] Display total profit "
						+ "\n[9] Save data to file \n[10] Load data from file \n[11] Display cheapest car in lot \\n[12] To look for favorite brand"
						+ "\n[13] To look inventory by price range \nEnter number from 0 to 13: ");
					
		option = input.nextInt();
			}
			
			 
		}
		
	}

}
