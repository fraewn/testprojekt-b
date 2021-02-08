package Singleton;

public class MilkyWay {
	private PlanetEarth planetEarth;

	public void milkyWayNews(){
		getEarthNews();
		System.out.println("[Milky Way]: One Hundred Million Years lAteR.... ");
		getEarthNews();
	}

	private void getEarthNews(){
		planetEarth = PlanetEarth.getInstance();
		planetEarth.swingBy();
	}
}
