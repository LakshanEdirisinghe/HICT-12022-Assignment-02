class dog{
	
	public static void main(String args[]){
		
		Car carObj = new Car();
		double resultcar = carObj.calculateRental(8);
		
		System.out.println("Rs: "+resultcar);
		
		Bike bikeObj = new Bike();
		double resultbike = bikeObj.calculateRental(5);
		
		System.out.println("Rs: "+resultbike);
		
		
		}
	
	}
	
abstract class Vehicle{

	abstract double calculateRental(int days);
	
	
}

class Car extends Vehicle{ 
	
		double calculateRental(int days){
		
			return days * 50.0;
		
		}
	
	
	}
class Bike extends Vehicle{ 
	
		double calculateRental(int days){
		
			return days * 20.0;
		
		}
	
	
	}
