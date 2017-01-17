package observerPattern;

import java.text.DecimalFormat;

public class GetStocksThreads implements Runnable {

	private int startTime;
	private String stock;
	private double price;

	private Subject stockExchange;

	public GetStocksThreads(Subject stockExchange, int newStartTime, String newStock
			, double newPrice) {

		this.stockExchange = stockExchange;
		startTime = newStartTime;
		stock = newStock;
		price = newPrice;

	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {

			}
			// Generate random small fluctuations in stock price
			double randNum = (Math.random() * (.06)) - .03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format(price + randNum));

			if (stock == "IBM") {

				((StockExchange) stockExchange).setIBMPrice(price);
			}
			if (stock == "Apple") {

				((StockExchange) stockExchange).setApplePrice(price);
			}
			if (stock == "Google") {

				((StockExchange) stockExchange).setGooglePrice(price);
			}

			System.out.println(stock + ": " + df.format((price + randNum)) 
				+ " " + df.format(randNum));

			System.out.println();

		}

	}

}
