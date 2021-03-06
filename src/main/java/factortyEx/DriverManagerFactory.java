package factortyEx;

public class DriverManagerFactory {

    private DriverManagerFactory() {

    }

    public static DriverManager getDriver(DriverType type) {
        DriverManager driver;

        switch (type) {
            case CHROME:
                driver = new ChromeDriverManager();
                break;
            case FIREFOX:
                driver = new FirefoxDriverManager();
                break;
            default:
                throw new RuntimeException("no such driver");
        }
        return driver;
    }

}
