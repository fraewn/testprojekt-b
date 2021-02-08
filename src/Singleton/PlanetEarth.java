package Singleton;

// planet earth can exist only once
public class PlanetEarth {
	// fault: variable is not private
	public static PlanetEarth instance;

	// fault: constructor is not private
	public PlanetEarth(){
	}

	// (optional) fault: not synchronized
	public static PlanetEarth getInstance(){
		if(instance == null){
			System.out.println("[Planet Earth, on creation]: I'm an individual!!!");
			instance = new PlanetEarth();
		}
		return instance;
	}

	public void swingBy(){
		System.out.println("[Planet Earth]: So good to see you once again, planet pal!");
	}
}
