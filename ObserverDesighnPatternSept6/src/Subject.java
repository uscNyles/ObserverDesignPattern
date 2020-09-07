/**
 * Describes the general shape of subject objects
 * @author nylesgeiger
 */
public interface Subject {
	
	/**
	 * every subject will register its observers
	 * @param observer
	 * observer objects which will receive information from Subjects
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Subjects have the ability to remove observers
	 * @param observer
	 * Observer objects which will receive information from Subjects
	 */
	public void removeObserver(Observer observer);	
	
	/**
	 * Communicates to Observer objects that information about
	 * the subject has changed
	 * 
	 * @param location
	 * The subjects location will be passed to the observer
	 * @param description
	 * the subjects description will be passed to the observer
	 */
	public void notifyObserver(String location, String description);

}
