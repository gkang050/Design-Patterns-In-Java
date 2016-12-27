// Represents each Observer that is monitoring changes in the subject

public class StockObserver implements Observer {

	@Override
	public String toString() {
		return "StockObserver [ibmPrice=" + ibmPrice + ", aaplPrice=" + aaplPrice + ", googPrice=" + googPrice
				+ ", observerID=" + observerID + ", stockGrabber=" + stockGrabber + "]";
	}

	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	// Static used as a counter

	private static int observerIDTracker = 0;

	// Used to track the observers

	private int observerID;

	// Will hold reference to the StockGrabber object

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {

		// Store the reference to the stockGrabber object so
		// I can make calls to its methods
		System.out.println("Received " + stockGrabber.toString() + " in the StockObserver constructor\n");
		this.stockGrabber = stockGrabber;

		// Assign an observer ID and increment the static counter

		this.observerID = ++observerIDTracker;

		// Message notifies user of new observer

		System.out.println("New Observer " + this.observerID);

		// Add the observer to the Subjects ArrayList
		System.out.println("Now registering  " + this.toString() + " observer");
		stockGrabber.register(this);

	}

	// Called to update all observers

	public void update(double ibmPrice, double aaplPrice, double googPrice) {

		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;

		printThePrices();

	}

	public void printThePrices() {

		System.out.println(
				"\n" + observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");

	}

}