public class Module5{

		interface Domestic { }
		interface Import { }

		interface Japanese extends Import { }
		interface German extends Import { }

		interface Detroit extends Domestic { }
		interface SpringHill extends Domestic { }
	   
		class Vehicle { 
			int getWeightInPounds();
		}
		class Automobile extends Vehicle {
			int getWeightInPounds()
			{
				return 1000;
			}  
		}
		class LargeAutomobile extends Vehicle { 
			int getWeightInPounds()
			{
				return 2500;
			}
		}
		interface Sedan extends Automobile { }
		interface Van extends LargeAutomobile { }
		interface Truck extends LargeAutomobile { }
		interface Compact extends Automobile { }
		interface SportsUtilityVehicle extends Truck, Van { }

		class SaturnSL1 implements SpringHill, Sedan 
		{
			int getWeightInPounds();
		} //domestic,automobile,vehicle
		class HondaCivic implements Japanese, Compact 
		{
			int getWeightInPounds();
		} //import,automobile,vehicle
		class MercedesC230 implements German, Sedan 
		{
			int	getWeightInPounds();
		}//import,automobile,vehicle
		class ChevyS10 implements Detroit, Truck 
		{ 	
			int getWeightInPounds();
		}//domestic,largeautomobile,vehicle
		class SubaruOutback implements Japanese, SportsUtilityVehicle {
			
			
		}//import,truck,van,largeautomobile,Vehicle()
	   
		public static void main(String [] args){
			
			SaturnSL1 sl = new SaturnSL1();
			HondaCivic hc = new HondaCivic();
			Japanese jp = null;
			German gr = new MercedesC230();
			ChevyS10 cs = null;
			SubaruOutback sb = new SubaruOutback( );
			Domestic dm = sl;
			//dm = hc;
			//dm = (Domestic)hc;
			dm = cs;
			dm = (Domestic)cs;
			Import im = sb;
			//gr = im;
			//gr = (German)im;
			//jp = im;
			//jp = (German)im;
			jp = (Japanese)im;
			Automobile a = null;
			a = hc;
	}
}