import java.util.ArrayList;

/**
 * Describes the behavior of a DEA object.
 * @author nylesgeiger
 */
public class DEA implements Observer{

	private Subject cook;
	private ArrayList<String> locations;
	private String notes = "";
	
	/**
	 * constructs a DEA object and a String ArrayList to 
	 * store locations
	 * 
	 * @param cook
	 * defines the subject for this instance of a DEA object
	 */
	public DEA(Subject cook) {
		this.cook = cook;
		cook.registerObserver(this);
		locations = new ArrayList<String>();
	}
	
	/**
	 * Stores the location and notes in its respective locations
	 * and custom formats
	 * @param location
	 * describes the location of the subject
	 * @param description
	 * the description passed from the subject
	 */
	@Override
	public void update(String location, String description) {
		locations.add(location);
		notes+= description + "\n";
		
	}

	/**
	 * returns the log of the subjects location
	 * and description in a custom format
	 */
	@Override
	public String getLog() {
		
		String deaSightings = "Locations: \n";
		
		for (String location: locations) {
			deaSightings += location + "\n";
		}
		
		deaSightings += "\n \nNotes: \n" + notes;
		return deaSightings;
	}

}
