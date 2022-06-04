package Utils;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum CommunicationOptions {
    WIFI(1),
    SIM(2);

    private int serial;

    private CommunicationOptions(int i) {
        this.serial = i;
    }


    public int getSerial()
    {
        return this.serial;
    }

    private static final Map<Integer, CommunicationOptions> ENUM_MAP;

    // Build an immutable map of String name to enum pairs.
    // Any Map impl can be used.

    static {
        Map<Integer, CommunicationOptions> map = new ConcurrentHashMap<Integer, CommunicationOptions>();
        for (CommunicationOptions instance : CommunicationOptions.values()) {
            map.put(instance.getSerial(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    public static CommunicationOptions get (int name) {
        return ENUM_MAP.get(name);
    }


    public static void showsOptions() {
        System.out.println("build options:");
        for (CommunicationOptions instance : CommunicationOptions.values()) {
            System.out.println(instance.getSerial() + ". " + instance);
        }
    }
}
