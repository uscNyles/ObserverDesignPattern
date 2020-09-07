import java.util.ArrayList;

/**
 * Describes the cook object which 
 * passes it's location to observer objects
 * @author nylesgeiger
 */
public class Cook implements Subject {
	
	private String name;
	private ArrayList<Observer> observers;

	/**
	 * Creates a cook object and a new ArrayList object of Observers
	 * @param name
	 * the name parameter is passed to the name field 
	 * and used as an identifier for the instance of the cook object
	 */
	public Cook (String name) {
		this.name = name;
		observers = new ArrayList<Observer>();
	}
	
	/**
	 * adds the given observer to the Existing 
	 * ArrayList for observer objects
	 * 
	 * @param observer
	 * the object added to the ArrayList
	 */
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	/**
	 * removes the given observer to the Existing 
	 * ArrayList for observer objects
	 * 
	 * @param observer
	 * the object removed to the ArrayList
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	/**
	 * makes the observers update when the subject's 
	 * information changes
	 * 
	 * @param location
	 * directed to be handled by the observer as a location
	 * 
	 * @param description
	 * directed to be handled by the observer as a description
	 */
	@Override
	public void notifyObserver(String location, String description) {
		for (Observer observer: observers) {
			observer.update(location, description);
		}

	}
	
	/**
	 * allows the Cooks information to be changed. 
	 * Alerts observers when activated
	 * 
	 * @param location
	 * the new location for the cook
	 * 
	 * @param description
	 * the new description for the cook
	 */
	public void enterSighting( String location, String description) {
		notifyObserver(location, description);
	}

	/**
	 * allows the name of the cook to be accessed
	 * 
	 * @return
	 * returns the name of the cook as a string
	 */
	public String getName() {
		return name;
	}
	
}
