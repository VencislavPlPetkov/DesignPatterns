package observerPattern;

public class StockBroker implements Observer {

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockExchange;

	public StockBroker(Subject stockExchange) {
		this.stockExchange = stockExchange;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		stockExchange.register(this);
	}

	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {

		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;

		printThePrices();

	}

	public void printThePrices() {
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nApple: " + applePrice + "\nGoogle: " + googlePrice);

	}

}
