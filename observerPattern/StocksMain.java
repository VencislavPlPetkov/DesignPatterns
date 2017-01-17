package observerPattern;

public class StocksMain {

	public static void main(String[] args) {
		StockExchange stockExchange = new StockExchange();
		StockBroker stockBrokerJohn = new StockBroker(stockExchange);
		
		stockExchange.setIBMPrice(197.0);
		stockExchange.setApplePrice(677.6);
		stockExchange.setGooglePrice(676.4);
		
		Runnable getIBM = new GetStocksThreads(stockExchange, 2, "IBM", 197.00);
		Runnable getApple = new GetStocksThreads(stockExchange, 2, "Apple", 550.00);
		Runnable getGoogle= new GetStocksThreads(stockExchange, 2, "Google", 450.00);
		
		
		new Thread(getIBM).start();
		new Thread(getApple).start();
		new Thread(getGoogle).start();
		
	}

}
