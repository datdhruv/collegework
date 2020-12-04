/* To Do
 * add takeTransport that calculates the fare
 * 	in that we need to ask for dest and source and calculate accordingly.
 */
import java.util.ArrayList;
// Static import allows us to import only functions instead of the whole library.
import static java.lang.Math.random;

abstract class Transport{
	
	public String vehicle;
	public ArrayList<String> stopOvers;
	public double rate;
	public double fare;
	public double distTravelled;
	public int timeTaken;
	public String origin;
	public String destination;
	public String frequency;
}

class Metro extends Transport{
	vehicle = "Metro";
	stopOvers = new ArrayList<Sting>();
	
	public void addStopOvers(ArrayList<String> stopOvers,String stop){
		stopOvers.add(stop);
	}

	rate = 1;
	fare = rate*(stopOvers.indexOf(destination) - stopOvers.indexOf(origin));
	frequency = "2 Mins";	
}

class Bus extends Transport{
	vehicle = "Bus";
	stopOvers = new ArrayList<Sting>();
	
	public void addStopOvers(ArrayList<String> stopOvers,String stop){
		stopOvers.add(stop);
	}

	rate = 2.5;
	fare = rate*(stopOvers.indexOf(destination) - stopOvers.indexOf(origin));
	frequency = "20 Mins";
}

class Aeroplane extends Transport{
	vehicle = "Aeroplane";
	stopOvers = new ArrayList<Sting>();
	
	public void addStopOvers(ArrayList<String> stopOvers,String stop){
		stopOvers.add(stop);
	}

	rate = 200*;
	fare = rate*(stopOvers.indexOf(destination) - stopOvers.indexOf(origin));
	frequency = null;
}

class Taxi extends Transport{
	vehicle = "Taxi";
	stopOvers = new ArrayList<String>();
	
	public void addStopOvers(ArrayList<String> stopOvers,String stop){
		stopOvers.add(stop);
	}

	rate = 1;
	fare = rate*(stopOvers.indexOf(destination) - stopOvers.indexOf(origin));
	frequency = "5 Mins";
}

class WaterWays extends Transport{
	vehicle = "Boat";
	stopOvers = new ArrayList<String>();

	public void addStopOvers(ArrayList<String> stopOvers,String stop){
		stopOvers.add(stop);
	}

	rate = 2;
	fare = rate*(stopOvers.indexOf(destination) - stopOvers.indexOf(origin));
	frequency = "30 Mins";
}

class RentCar extends Transport{
	vehicle = "Rent a car";
	stopOvers = new ArrayList<Sting>();
	
	public void addStopOvers(ArrayList<String> stopOvers,String stop){
		stopOvers.add(stop);
	}

	rate = 1;
	fare = rate*(stopOvers.indexOf(destination) - stopOvers.indexOf(origin));
	frequency = null;
}

class InitTransport{
	{
	// All cities with a metro
	ArrayList<Metro> Dubai = new ArrayList<Metro>();

	// All cities with a Bus
	ArrayList<Bus> Dubai = new ArrayList<Bus>();
	ArrayList<Bus> AbuDhabi = new ArrayList<Bus>();
	ArrayList<Bus> RasAlKhaimah  = new ArrayList<Bus>();
	ArrayList<Bus> Fujairah = new ArrayList<Bus>();

	// All cities with a Aeroplane
	ArrayList<Aeroplane>  Dubai = new ArrayList<Aeroplane>();
	ArrayList<Aeroplane>  AbuDhabi = new ArrayList<Aeroplane>();

	// All cities with a Taxi
	ArrayList<Taxi>  AbuDhabi = new ArrayList<Taxi>();
	ArrayList<Taxi>  Dubai = new ArrayList<Taxi>();
	ArrayList<Taxi>  RasAlKhaimah = new ArrayList<Taxi>();
	ArrayList<Taxi>  Fujairah = new ArrayList<Taxi>();

	// All cities with a RentCar
	ArrayList<RentCar>  AbuDhabi = new ArrayList<RentCar>();
	ArrayList<RentCar>  Dubai = new ArrayList<RentCar>();
	ArrayList<RentCar>  RasAlKhaimah = new ArrayList<RentCar>();
	ArrayList<RentCar>  Fujairah = new ArrayList<RentCar>();

	// All cities with a WaterWays
	ArrayList<WaterWays>  AbuDhabi = new ArrayList<WaterWays>();
	ArrayList<WaterWays>  Dubai = new ArrayList<WaterWays>();
	ArrayList<WaterWays>  RasAlKhaimah = new ArrayList<WaterWays>();
	ArrayList<WaterWays>  Fujairah = new ArrayList<WaterWays>();
	}

	InitTransport(){
		
	}

}
