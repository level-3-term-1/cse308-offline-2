package Utils;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum BuildOptions {
    DELUXE(1),
    OPTIMAL(2),
    POOR(3);

    private int serial;

    private BuildOptions(int i) {
        this.serial = i;
    }


    public int getSerial()
    {
        return this.serial;
    }

    private static final Map<Integer,BuildOptions> ENUM_MAP;

    // Build an immutable map of String name to enum pairs.
    // Any Map impl can be used.

    static {
        Map<Integer,BuildOptions> map = new ConcurrentHashMap<Integer, BuildOptions>();
        for (BuildOptions instance : BuildOptions.values()) {
            map.put(instance.getSerial(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static BuildOptions get (int name) {
        return ENUM_MAP.get(name);
    }


    public static void showsOptions() {
        System.out.println("build options:");
        for (BuildOptions instance : BuildOptions.values()) {
            System.out.println(instance.getSerial() + ". " + instance);
        }
    }
}
