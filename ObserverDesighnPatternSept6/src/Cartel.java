import java.util.ArrayList;

/**
 * The cartel class describes how the cartel object will store the
 * location and description it will receive from the cook.
 * 
 * @author nylesgeiger
 *
 */
public class Cartel implements Observer {
	
	private Subject cook;
	ArrayList<Sighting> sightings;

	/**
	 * Creates the Cartel object.
	 * 
	 * the subject parameter is passed to the cook field and used to
	 * call the registerObserver for this class instance.
	 * 
	 * @param cook
	 */
	public Cartel (Subject cook) {
		this.cook = cook;
		cook.registerObserver(this);
		sightings = new ArrayList<Sighting>();
	}
	
	/**
	 * adds a new Sighting to the sightings field with 
	 * the given location and description
	 */
	@Override
	public void update(String location, String description) {
		sightings.add( new Sighting(location, description));
		
	}

	/**
	 * Returns a string of locations with each associated description
	 * coming after it surrounded by parenthesis
	 */
	@Override
	public String getLog() {
		
		String cartelSightings = "";
		
		for (Sighting sight: sightings) {
			cartelSightings += sight.getLocation();
			cartelSightings += " (" + sight.getDetails() + ")\n";
		}
		return cartelSightings;
	}

}
