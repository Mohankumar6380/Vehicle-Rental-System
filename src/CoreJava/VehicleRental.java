package CoreJava;
import java.util.*;
import java.util.Map.Entry;

public class VehicleRental {
		
	public static void main(String[] args) {
		
//		Use Scanner Class
		Scanner scan = new Scanner(System.in);
		System.out.println("------Vehicle Rental System------");
		
		boolean running = true;
		while(running) {
//		While has been Used For Loop Program Untill Enter Exit
			
			System.out.println("Select Your Option");
			System.out.println("1. Login \n2.View Availables Cars \n3.Exit");
			int choice = scan.nextInt();
//	``  Switch case used for user Choose the option 
			switch(choice) {
				case 1 :
//		This Case Created for Login option
					String userName = "user";
					int userPassword =123;
					System.out.println("Enter the Name");
					String name = scan.next();
					System.out.println("Enter the Password");
					int password = scan.nextInt();
					if(userName.equals(name) && userPassword==password) {
					System.out.println("Login Succcessful !");
					}
					else {
						System.out.println("UserName and Password is Invalid");
						running = false;
					}
					break;
			
				case 2 :
//		This Case Created For Book The Vehicle					
					Map<Integer, String> cars = new HashMap<>();
				
					cars.put(1010,"VehicleAvailable");
					cars.put(2020, "Mahindra XUV 700");
					cars.put(3030, "Toyota Innova");
					cars.put(4040, "BMW X5");
					cars.put(5050, "Mahindra Thar");
					
					while(!cars.isEmpty()) {
					System.out.println("Available cars :"+cars);
					
					System.out.println("\nWhich Car would you like please enter car's ID or Enter (3)to Exit");
					
					Map<Integer, String> details = new HashMap<>();
					details.put(1010, "Volkswagen Polo \nEngine : 999 cc - 1498 cc \nSeat : 5 \nMileage : 21.49 kmpl \nFuel : Petrol / Diesel \nint Per Day 2500.0 \nAdvance Amount : 25000.0 ");

					details.put(2020, "Mahindra XUV 700 \nEngine : 2198 cc \nSeat : 7 \nMileage :  17 kmpl \nFuel : Petrol / Diesel \nPer Day :3500.0 \\nAdvance Amount : 35000.0");
					
					details.put(3030, "Toyota Innova \nEngine : 2494 cc \nSeat : 7 \nMileage : 12.99 kmpl \n Fuel : Diesel \nPer Day :3500.0 \nAdvance Amount : 35000.0");					
					
					details.put(4040, "BMW X5 \nEngine : 2993 cc \nSeat : 5 \nMileage : 12 kmpl \nFuel : Diesel \\nPer Day :5000.0 \nAdvance Amount : 50000.0");
					
					details.put(5050, "Mahindra Thar \nEngine : 1497 cc - 2184 cc \nSeat : 4 \nMileage : 9kmpl \nFuel : Diesel \nPer Day :4000.0 \nAdvance Amount : 40000.0");	
							
					
					for(Entry<Integer, String> car : cars.entrySet()) {
						System.out.println(car.getKey()+" "+car.getValue());
					}
					int rent = 2000;
					int userChoice = scan.nextInt();
				
					if(details.containsKey(userChoice)) {
					System.out.println(details.get(userChoice));
					}
					else if(userChoice==3) {
					   System.out.println("Thankyou....!!!");
						running=false;
					   break;
						
					}
					System.out.println("Book the car enter (1) , Skip or Exit(2)");
					int enter = scan.nextInt();
					if(enter==1) {
						System.out.println("Enter the car id");
						int book = scan.nextInt();
						System.out.println("How Many Days You book");
						int days = scan.nextInt();
						
						if(cars.containsKey(book)) {
							System.out.println("Your Booked Car : "+ cars.get(book));
							System.out.println("Total Amount : "+ rent*days);
							cars.remove(book);
							System.out.println("Booking Successful!\n");
							
						}
						else {
							
							System.out.println("Invalid Car ID");
						}
					
					}
					
//     Else If Concepet based Skip The car					
					else if(enter==2) {
					System.out.println("Enter the Car number to Skip");	
					int carSkip = scan.nextInt();
						if(cars.containsKey(carSkip)) {
							String skip = cars.remove(carSkip);
							cars.put(carSkip, skip);
						}
						else {
							System.out.println("Invalid Car number Or Already Skipped");
						}
					}
						else {
							System.out.println();
						}	
					}
					break;
								
					case 3 :
//		This Case Created For Exit the whole Program				
						System.out.println("Exiting....");
						running = false;
						break;
						
					default :
						System.out.println("Invalid input");
					
			}					
		}
		scan.close();
	}
}