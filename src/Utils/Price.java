package Utils;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum Price {
    RASPBERRY_PI(400),
    ARDUINO_MEGA(200),
    ATMEGA_32(80),
    SIM(60),
    SIM_MONTHLY(25),
    WIFI(100),
    WIFI_MONTHLY(100),
    LCD(50),
    LED(30),
    APPLICATION(1000),
    ;

    private double value;

    private Price(double i) {
        this.value = i;
    }

    public double getValue()
    {
        return this.value;
    }

    private static final Map<Double,Price> ENUM_MAP;

    // Build an immutable map of String name to enum pairs.
    // Any Map impl can be used.

    static {
        Map<Double,Price> map = new ConcurrentHashMap<Double, Price>();
        for (Price instance : Price.values()) {
            map.put(instance.getValue(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Price get (int name) {
        return ENUM_MAP.get(name);
    }


    public static void showsOptions() {
        for (Price instance : Price.values()) {
            System.out.println(instance.getValue() + ". " + instance);
        }
    }
}
