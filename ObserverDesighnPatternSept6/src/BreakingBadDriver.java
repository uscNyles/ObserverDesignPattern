
/**
 * September 06, 2020
 * 
 * The BreakingBadDriver contains the main method where
 * each object is created and values are through passed through them
 * @author nylesgeiger
 *
 */
public class BreakingBadDriver {

	/**
	 * the main method with the default parameter. Objects are created
	 * and values are passed through methods. The format of the 
	 * printing is designed here
	 * @param args
	 */
	public static void main(String[] args) {
		Cook heinzenberg = new Cook("Heinzenberg");
		Observer dea = new DEA(heinzenberg);
		Observer cartel = new Cartel(heinzenberg);
		
		System.out.println("***** " + heinzenberg.getName() + " is Breaking Bad *****");
		heinzenberg.enterSighting("School Chemistry Lab", "Meeting with Jesse");
		heinzenberg.enterSighting("RV in the desert", "Cooking");
		heinzenberg.enterSighting("Laundrymat", "Doing his Laundry...");
		heinzenberg.enterSighting("Car Wash", "Laundering Money");
		heinzenberg.enterSighting("Car Lot", "Buying a Fancy Sports Car");
		
		System.out.println("\n***** DEA Notes *****");
		System.out.println(dea.getLog());
		
		System.out.println("\n***** Cartel Notes *****");
		System.out.println(cartel.getLog());
	}
}
