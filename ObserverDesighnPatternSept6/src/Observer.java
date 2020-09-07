/**
 * Describes the general shape of 
 * observer objects. Implemented by Cartel and DEA
 * @author nylesgeiger
 */
public interface Observer {
	/**
	 * How the observer should store the 
	 * @param location
	 * the location the subject will pass to the observer
	 * @param description
	 * the description the observer will receive from the subject
	 */
	public void update(String location, String description);
	/**
	 * each observer return their subjects location
	 * and description as a string.
	 * @return
	 * string of the given locations and descriptions
	 */
	public String getLog();
}
