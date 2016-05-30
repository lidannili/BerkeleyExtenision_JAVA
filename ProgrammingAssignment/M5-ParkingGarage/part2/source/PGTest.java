//Write a class ParkingGarage which simulates a garage for parking Vehicles. 
//The garage should have have enough capacity to park 20 Vehicles or 25,000 pounds. 
//It should refuse to park any Vehicle that would push the garage over either of these limits. 
//Note that ParkingGarage should be a well-behaved class; in particular, 
//it should be possible to create multiple independent ParkingGarages in one program.
//ParkingGarage should have a main routine which demonstrates its capabilities. main( ) need not accept any user input.
import java.util.*;
interface Domestic { }
interface Import { }

interface Japanese extends Import { }
interface German extends Import { }

interface Detroit extends Domestic { }
interface SpringHill extends Domestic { }
	   
interface Vehicle {
	int getWeightInPounds();
}
interface Automobile extends Vehicle {
	int weight = 1000;
}
interface LargeAutomobile extends Vehicle { 
	int weight = 2500;	
}
interface Sedan extends Automobile { }
interface Van extends LargeAutomobile { }
interface Truck extends LargeAutomobile { }
interface Compact extends Automobile { }
interface SportsUtilityVehicle extends Truck, Van { }

class SaturnSL1 implements SpringHill, Sedan 
	{
		public int getWeightInPounds(){
			return weight;
		}	
	} //domestic,automobile,vehicle

class HondaCivic implements Japanese, Compact 
	{
		public int getWeightInPounds(){
			return weight;
		}	
	} //import,automobile,vehicle
class MercedesC230 implements German, Sedan 
	{	
		public int getWeightInPounds(){
			return weight;
		}	
	}//import,automobile,vehicle

class ChevyS10 implements Detroit, Truck 
	{ 	
		public int getWeightInPounds(){
			return weight;
		}	
	}//domestic,largeautomobile,vehicle

class SubaruOutback implements Japanese, SportsUtilityVehicle 
	{
		public int getWeightInPounds(){
			return weight;
		}	
	}//import,truck,van,largeautomobile,Vehicle()

class ParkingGarage
{
	private static int max_capacity = 20;
	private static double max_weight = 25000;
	
	private int count = 0;
	private double totalweight = 0;

	void checkin(Vehicle car)
	{
		totalweight = totalweight + car.getWeightInPounds();
		count++; 			
		try{
			if(count<max_capacity && totalweight < max_weight)
			{
				System.out.println("Welcome to the Parking Garage");
				System.out.println(totalweight);
				System.out.println(count);	
			}
		}
		catch(Exception ex)
		{
			System.out.println("The Parking Garage is full. Please wait until the next available spot");
		}
	}

	void checkout(Vehicle car){
		totalweight = totalweight - car.getWeightInPounds();
		count--; 			
		try{
			if(count > 0 && totalweight > 1000)
			{
				System.out.println("See you next time");
				System.out.println(totalweight);
				System.out.println(count);	
			}
		}
		catch(Exception ex)
		{
			System.out.println("The parking Garage is empty.");
		}
	}
}

public class PGTest 
{
	public static void main(String[] args)
	{
		SaturnSL1 sl = new SaturnSL1();
		HondaCivic hc = new HondaCivic();
		MercedesC230 mc = new MercedesC230();
	   	ChevyS10 cs = new ChevyS10();
	   	SubaruOutback sb = new SubaruOutback();
		
		ParkingGarage PG1 = new ParkingGarage();
		System.out.println("ParkingGarage1");
		PG1.checkin(sl);
		PG1.checkin(hc);
		PG1.checkin(mc);
		PG1.checkin(cs);
		PG1.checkin(sb);

		ParkingGarage PG2 = new ParkingGarage();
		System.out.println("ParkingGarage2");
		PG2.checkin(sl);
		PG2.checkin(hc);
		PG2.checkin(mc);
		PG2.checkin(cs);
		PG2.checkin(sb);
		PG2.checkout(sb);
		PG2.checkin(sl);
		PG2.checkin(hc);
		PG2.checkin(mc);
		PG2.checkin(cs);
		PG2.checkin(sb);
		PG2.checkin(sl);
		PG2.checkin(hc);
		PG2.checkin(mc);
		PG2.checkin(cs);
		PG2.checkin(sb);
		PG2.checkin(mc);
		PG2.checkin(cs);
		PG2.checkin(sb);
		PG2.checkin(mc);
		PG2.checkin(cs);
		PG2.checkin(sb);

		ParkingGarage PG3 = new ParkingGarage();
		System.out.println("ParkingGarage3");
		PG3.checkin(sl);
		PG3.checkin(hc);
		PG3.checkin(mc);
		PG3.checkin(cs);
		PG3.checkin(sb);
		PG3.checkout(sb);


	}
}