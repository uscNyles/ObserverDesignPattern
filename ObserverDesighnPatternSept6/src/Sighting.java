/**
 * Describes how the Cartel will store the information
 *  passed to it by its subject
 * @author nylesgeiger
 */
public class Sighting {
	private String location;
	private String details;
	
	/**
	 * creates a Sighting object
	 * 
	 * @param location
	 * describes the location
	 * @param details
	 * defines the description
	 */
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
	}

	/**
	 * retruns the given location as a string
	 * @return
	 * String
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * returns the given description as a string
	 * @return
	 * String
	 */
	public String getDetails() {
		return details;
	}
	
}
