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

public class Module5{
	
	public static void main(String [] args){
		SaturnSL1 sl = new SaturnSL1();
		HondaCivic hc = new HondaCivic();
		//Japanese jp = new Japanese();  //Japanese is abstract; cannot be instantiated
		Japanese jp = null;
		German gr = new MercedesC230();
		//ChevyS10 cs = new Truck(); //Truck is abstract; cannot be instantiated
	   	ChevyS10 cs = null;
	   	SubaruOutback sb = new SubaruOutback();
	   	Domestic dm = sl;
	   	//dm = hc; // <identifier> expected
	   	//dm = null;
	   	//dm = (Domestic)hc; 	// error: <identifier> expected
	   	dm = cs;
	   	dm = (Domestic)cs;
	   	Import im = sb;
	   	//gr = im;
	   	//gr = (German)im;
	   	//jp = im;
	   	jp = (Japanese)im;
	   	//Automobile a = cs;
	   	Automobile a = null;
	   	a = hc;
	   	System.out.println(sl.getWeightInPounds());

	   	}
	}


		
