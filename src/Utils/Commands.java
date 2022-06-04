package Utils;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum Commands{
    SHOW(1),
    PLACE_ORDER(2),
    EXIT(3);

    private int serial;

    // getter method
    public int getSerial()
    {
        return this.serial;
    }

    private Commands(int serial)
    {
        this.serial = serial;
    }

    private static final Map<Integer,Commands> ENUM_MAP;

    // Build an immutable map of String name to enum pairs.
    // Any Map impl can be used.

    static {
        Map<Integer,Commands> map = new ConcurrentHashMap<Integer, Commands>();
        for (Commands instance : Commands.values()) {
            map.put(instance.getSerial(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static Commands get (int name) {
        return ENUM_MAP.get(name);
    }

    public static void showsOptions() {
        for (Commands instance : Commands.values()) {
            System.out.println(instance.getSerial() + ". " + instance);
        }
    }
}
