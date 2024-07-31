public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create the stock market
        StockMarket stockMarket = new StockMarket("TechCorp", 150.00);

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Update stock price
        System.out.println("Updating stock price...");
        stockMarket.setStockPrice(155.00);

        // Remove an observer and update stock price again
        stockMarket.deregisterObserver(mobileApp);
        System.out.println("Updating stock price...");
        stockMarket.setStockPrice(160.00);
    }
}
