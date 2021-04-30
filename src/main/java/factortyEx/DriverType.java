package factortyEx;

public enum DriverType {
    CHROME("CHROME"),
    FIREFOX("FIREFOX");

    private final String type;

    DriverType(String type) {
        this.type = type;
    }

    public static DriverType fromValue(String value) {
        return DriverType.valueOf(value);
    }

}
